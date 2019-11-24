package main.serializable.pgms;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UserDetails implements Serializable {

  /**
   * 
  */
  private static final long serialVersionUID = 1L;

  private int accountNo;

  private String userName;

  private transient String password;

  UserDetails(int accountNo, String userName, String password) {
    this.accountNo = accountNo;
    this.userName = userName;
    this.password = password;
  }

  private void writeObject(ObjectOutputStream oos) throws IOException {
    oos.defaultWriteObject();
    String encryptedPassword = this.password.concat("123");
    // Writing password in characters so that in future if an unknown person get
    // access to the file he won't able to see the password
    oos.writeChars(encryptedPassword);
  }

  private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    String encryptedPassword = "";
    Character c = ois.readChar();
    while (c != null) {
      encryptedPassword += c;
      try {
        c = ois.readChar();
      } catch (EOFException ex) {
        System.out.println("End of file exception caught");
        c = null;
      }
    }
    this.password = encryptedPassword.substring(0, (encryptedPassword.length() - 3));
  }

  @Override
  public String toString() {
    return "UserDetails [accountNo=" + accountNo + ", userName=" + userName + ", password=" + password + "]";
  }

}

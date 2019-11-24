package main.serializable.pgms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Externalization can be used to store only the required values not the
 * complete object. In serialization we can't store only the part of data. If we
 * try to save it will store all the values present in the object. In
 * serialization JVM will have the complete control and programmer doesn't have
 * any control. In externalization programmer have complete control and JVM
 * won't have any control. In order to achieve this externalization interface
 * need to be implemented and then the corresponding writeExternal and
 * readExternal method has to provide the implementation based on your
 * requirement.
 * 
 * While deserializing the JVM first will create the object with default values
 * for this default constructor is compulsory. If we don't have any default
 * constructor then we will get InvalidClassException. First JVM will create
 * object with default values and then the default values will be replaced by
 * readExternal method implementation.
 * 
 * @author Surendar
 *
 */
public class ExternalizationEx {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    try (FileOutputStream fos = new FileOutputStream("G:\\Photon workspace\\Practice_1\\externalize-ex.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);) {
      AccountDetails accountDetails = new AccountDetails(1000L, "Surendar", 27);
      oos.writeObject(accountDetails);
      System.out.println("accountDetails :" + accountDetails);
      System.out.println("Object written to the file");

      try (FileInputStream fis = new FileInputStream("G:\\Photon workspace\\Practice_1\\externalize-ex.ser");
          ObjectInputStream ois = new ObjectInputStream(fis);) {
        AccountDetails accDetails = (AccountDetails) ois.readObject();
        System.out.println("accDetails :" + accDetails);
        System.out.println("Object read from the file");
      }
    }
  }
}

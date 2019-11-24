package main.serializable.pgms;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class AccountDetails implements Externalizable {

  private Long accountNo;
  private String customerName;
  private int customerAge;

  public AccountDetails() {
  }

  public AccountDetails(Long accountNo, String customerName, int customerAge) {
    this.accountNo = accountNo;
    this.customerName = customerName;
    this.customerAge = customerAge;
  }

  @Override
  public String toString() {
    return "AccountDetails [accountNo=" + accountNo + ", customerName=" + customerName + ", customerAge=" + customerAge
        + "]";
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeLong(accountNo);
    out.writeBytes(customerName);
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    this.accountNo = in.readLong();
    this.customerName = in.readLine();
  }

}

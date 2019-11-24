package main.collectionex.pgms;

public class BankComparable implements Comparable<BankComparable> {

  private int bankId;

  private String bankName;

  BankComparable(int bankId, String bankName) {
    this.bankId = bankId;
    this.bankName = bankName;
  }

  public int getBankId() {
    return bankId;
  }

  public void setBankId(int bankId) {
    this.bankId = bankId;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  @Override
  public String toString() {
    return "Bank [bankId=" + bankId + ", bankName=" + bankName + "]";
  }

  @Override
  public int compareTo(BankComparable o) {
    return o.getBankId() - this.bankId;
  }

}

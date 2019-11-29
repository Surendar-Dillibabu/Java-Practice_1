package main.cloning.ex.pgms;

public class EmployeeAddress implements Cloneable {

  private int flatNo;

  private String streetName;

  EmployeeAddress(int flatNo, String streetName) {
    this.flatNo = flatNo;
    this.streetName = streetName;
  }

  public int getFlatNo() {
    return flatNo;
  }

  public void setFlatNo(int flatNo) {
    this.flatNo = flatNo;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  @Override
  public EmployeeAddress clone() throws CloneNotSupportedException {
    return (EmployeeAddress) super.clone();
  }

  @Override
  public String toString() {
    return "Address [flatNo=" + flatNo + ", streetName=" + streetName + "]";
  }

}

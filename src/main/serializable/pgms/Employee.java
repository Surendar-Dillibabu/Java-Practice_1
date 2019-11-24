package main.serializable.pgms;

import java.io.Serializable;

public class Employee implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public static final String companyName = "Sella";

  private int employeeId;

  private String employeeName;

  Employee(int employeeId, String employeeName) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
  }

  @Override
  public String toString() {
    return "Employee [ companyName=" + companyName + ", employeeId=" + employeeId + ", employeeName=" + employeeName
        + "]";
  }

}

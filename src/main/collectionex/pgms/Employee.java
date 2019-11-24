package main.collectionex.pgms;

public class Employee implements Comparable<Employee> {

  private int employeeId;

  private String employeeName;

  private int employeeAge;

  Employee(int employeeId, String employeeName, int employeeAge) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.employeeAge = employeeAge;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public int getEmployeeAge() {
    return employeeAge;
  }

  public void setEmployeeAge(int employeeAge) {
    this.employeeAge = employeeAge;
  }

  @Override
  public int compareTo(Employee o) {
    return this.employeeId - o.employeeId;
  }

  @Override
  public String toString() {
    return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
        + "]";
  }

}

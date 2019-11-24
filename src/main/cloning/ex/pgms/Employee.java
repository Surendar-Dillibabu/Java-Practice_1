package main.cloning.ex.pgms;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

  private int employeeId;

  private String employeeName;

  private List<String> listOfCompanyWorked;

  public Employee(int employeeId, String employeeName, List<String> listOfCompanyWorked) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;

    // Creating our own copy of ArrayList and setting into the class variable
    if (listOfCompanyWorked != null && !listOfCompanyWorked.isEmpty()) {
      List<String> companyWorkedList = new ArrayList<>(listOfCompanyWorked.size());
      listOfCompanyWorked.forEach(wc -> {
        companyWorkedList.add(wc);
      });
      this.listOfCompanyWorked = companyWorkedList;
    }
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

  public List<String> getListOfCompanyWorked() {
    return listOfCompanyWorked;
  }

  public void setListOfCompanyWorked(List<String> listOfCompanyWorked) {
    this.listOfCompanyWorked = listOfCompanyWorked;
  }

  @Override
  public Employee clone() throws CloneNotSupportedException {
    Employee e1 = (Employee) super.clone();
    List<String> originalWorkCompanyList = e1.getListOfCompanyWorked();

    // Creating our own copy of ArrayList and setting into the class variable while
    // cloning
    if (originalWorkCompanyList != null && !originalWorkCompanyList.isEmpty()) {
      List<String> companyWorkedList = new ArrayList<>(originalWorkCompanyList.size());
      originalWorkCompanyList.forEach(wc -> {
        companyWorkedList.add(wc);
      });
      e1.setListOfCompanyWorked(companyWorkedList);
    }

    return e1;
  }

  @Override
  public String toString() {
    return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", listOfCompanyWorked="
        + listOfCompanyWorked + "]";
  }
}

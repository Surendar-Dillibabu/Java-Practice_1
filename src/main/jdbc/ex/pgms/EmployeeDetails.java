package main.jdbc.ex.pgms;

import java.sql.Date;
import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class EmployeeDetails implements SQLData {

  private int employeeId;
  private String employeeName;
  private int salary;
  private int deptId;
  private Date joiningDate;

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

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getDeptId() {
    return deptId;
  }

  public void setDeptId(int deptId) {
    this.deptId = deptId;
  }

  public Date getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(Date joiningDate) {
    this.joiningDate = joiningDate;
  }

  @Override
  public String getSQLTypeName() throws SQLException {
    return null;
  }

  @Override
  public void readSQL(SQLInput stream, String typeName) throws SQLException {
    this.employeeId = stream.readInt(); // EMPLOYEE_ID
    this.employeeName = stream.readString(); // EMPLOYEE_NAME
    this.salary = stream.readInt(); // SALARY
    this.deptId = stream.readInt(); // DEPT_ID
    this.joiningDate = stream.readDate(); // JOINING_DATE
  }

  @Override
  public void writeSQL(SQLOutput stream) throws SQLException {
    stream.writeInt(employeeId);
    stream.writeString(employeeName);
    stream.writeInt(salary);
    stream.writeInt(deptId);
    stream.writeDate(joiningDate);
  }

}

package main.collectionex.pgms;

public class Department {

  private int departmentId;

  private String departmentName;

  Department(int departmentId, String departmentName) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
  }

  public int getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }
  
  @Override
  public int hashCode() {    
    return this.departmentId + this.departmentName.hashCode();
  }

  @Override
  public String toString() {
    return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
  }

}

package main.java8.ex.pgms.collectors;

public class Student {

  private Long studentId;
  private String studentName;
  private int deptId;

  Student(Long studentId, String studentName, int deptId) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.deptId = deptId;
  }

  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public int getDeptId() {
    return deptId;
  }

  public void setDeptId(int deptId) {
    this.deptId = deptId;
  }

  @Override
  public String toString() {
    return "[studentId=" + studentId + ", studentName=" + studentName + ", deptId=" + deptId + "]";
  }

}

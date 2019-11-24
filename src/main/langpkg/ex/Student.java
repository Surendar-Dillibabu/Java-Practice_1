package main.langpkg.ex;

public class Student {

  private int studentId;
  private String studentName;

  public Student() {
  }

  public Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
  }

  @Override
  public String toString() {
    return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
  }

}

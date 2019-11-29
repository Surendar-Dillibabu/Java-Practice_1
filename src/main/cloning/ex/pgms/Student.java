package main.cloning.ex.pgms;

import java.util.List;

public class Student implements Cloneable {

  private int studentId;

  private String studentName;

  private StudentAddress address;

  private List<String> subjectList;

  Student(int studentId, String studentName, StudentAddress address, List<String> subjectList) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.address = address;
    this.subjectList = subjectList;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public StudentAddress getAddress() {
    return address;
  }

  public void setAddress(StudentAddress address) {
    this.address = address;
  }

  public List<String> getSubjectList() {
    return subjectList;
  }

  public void setSubjectList(List<String> subjectList) {
    this.subjectList = subjectList;
  }

  // Here in object class the corresponding clone method is declared as protected.
  // so, we can either declare the overrided method as protected or public.
  // If we declare as private or default it will throw since we can't reduce the
  // visibility of the inherited method from Object
  @Override
  public Student clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }

  @Override
  public String toString() {
    return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
        + ", subjectList=" + subjectList + "]";
  }

}

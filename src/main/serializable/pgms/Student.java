package main.serializable.pgms;

import java.io.Serializable;

public class Student implements Serializable {

  /**
   * 
  */
  private static final long serialVersionUID = 1L;

  // static variable won't be written into file since it is not part of object it
  // is an part of class.
  public static String collegeName = "Anna University";

  // declaring final variable as transient is no-use. Since the variable is final
  // in the compile time the compiler treat it as value not as variable-value
  // combination (i.e. Compile time constant)
  // so, it won't have any impact. It will automatically written into the file
  // even though it is declared as transient
  public final transient int collegeId = 100;

  private int studentId;
  private String studentName;
  private int age;
  private transient Long mobileNumber;
  private Department department;

  public Student(int studentId, String studentName, int age, Long mobileNumber, Department department) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.age = age;
    this.mobileNumber = mobileNumber;
    this.department = department;
  }

  @Override
  public String toString() {
    return "collegeName : " + collegeName + ", Student [collegeId=" + collegeId + ", studentId=" + studentId
        + ", studentName=" + studentName + ", age=" + age + ", mobileNumber=" + mobileNumber + ", department="
        + department + "]";
  }

}

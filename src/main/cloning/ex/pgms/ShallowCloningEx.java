package main.cloning.ex.pgms;

import java.util.ArrayList;
import java.util.List;

public class ShallowCloningEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    List<String> ls = new ArrayList<>();
    ls.add("Chemistry");
    ls.add("Maths");
    StudentAddress sAd = new StudentAddress(10, "West street");
    Student s1 = new Student(100, "Surendar", sAd, ls);
    System.out.println("s1 object :" + s1);

    Student s2 = s1.clone();

    // Adding one more subject after cloned.
    ls.add("Computer-science");

    // setting different address
    sAd.setStreetName("East street");

    // Changing student id
    s2.setStudentId(200);
    // Adding one more subject in the list which is present in the cloned object
    s2.getSubjectList().add("Social-science");

    System.out.println("Final s2 object :" + s2);
    System.out.println("Final s1 object :" + s1);
  }
}

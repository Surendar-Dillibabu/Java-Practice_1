package main.cloning.ex.pgms;

import java.util.ArrayList;
import java.util.List;

public class ShallowCloningEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    List<String> ls = new ArrayList<>();
    ls.add("Chemistry");
    ls.add("Maths");
    
    Student s1 = new Student(100, "Surendar", ls);
    System.out.println("s1 object :" + s1);
    
    Student s2 = s1.clone();
    
    // Adding one more subject after cloned.
    ls.add("Computer-science"); 
    
    // Changing student id
    s2.setStudentId(200);
    // Adding one more subject in the list which is present in the cloned object
    s2.getSubjectList().add("Social-science");
    
    System.out.println("Final s2 object :" + s2);
    System.out.println("Final s1 object :" + s1);
  }
}

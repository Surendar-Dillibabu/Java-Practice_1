package main.cloning.ex.pgms;

import java.util.ArrayList;
import java.util.List;

public class DeepCloningEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    List<String> ls = new ArrayList<>();
    ls.add("Hotcourses");
    ls.add("Sella");

    Employee emp1 = new Employee(100, "Surendar", ls);
    System.out.println("emp1 object :" + emp1);

    Employee emp2 = emp1.clone();

    // Adding one more working company after cloned.
    ls.add("FreshWorks");

    // Changing employee id
    emp2.setEmployeeId(200);
    // Adding one more working company in the list which is present in the cloned
    // object
    emp2.getListOfCompanyWorked().add("Amazon");

    System.out.println("Final emp2 object :" + emp2);
    System.out.println("Final emp1 object :" + emp1);
  }
}

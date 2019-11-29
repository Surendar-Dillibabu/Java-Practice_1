package main.cloning.ex.pgms;

import java.util.ArrayList;
import java.util.List;

public class DeepCloningEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    List<String> ls = new ArrayList<>();
    ls.add("Hotcourses");
    ls.add("Sella");

    EmployeeAddress empAdd = new EmployeeAddress(10, "North street");

    Employee emp1 = new Employee(100, "Surendar", empAdd, ls);
    System.out.println("emp1 object :" + emp1);

    Employee emp2 = emp1.clone();

    // Adding one more working company after cloned.
    ls.add("FreshWorks");

    // Updating the employee address object
    empAdd.setStreetName("South street");

    // Changing employee id
    emp2.setEmployeeId(200);

    // Changing employee address
    emp2.getEmpAddress().setStreetName("East street");

    // Adding one more working company in the list which is present in the cloned
    // object
    emp2.getListOfCompanyWorked().add("Amazon");

    System.out.println("Final emp2 object :" + emp2);
    System.out.println("Final emp1 object :" + emp1);
  }
}

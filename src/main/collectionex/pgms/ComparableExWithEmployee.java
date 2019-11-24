package main.collectionex.pgms;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparableExWithEmployee {

  class EmployeeNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
      return o1.getEmployeeName().compareTo(o2.getEmployeeName());
    }

  }

  public static void main(String[] args) {
    Set<Employee> ts = new TreeSet<>();
    ts.add(new Employee(105, "Sushmanth", 27));
    ts.add(new Employee(108, "Kannan", 26));
    ts.add(new Employee(100, "Surendar", 27));
    ts.add(new Employee(112, "Saleem", 25));

    // Below is duplicate so it won't allow
    // ts.add(new Employee(100, "Surendar.D", 28));
    ts.add(new Employee(110, "AnnaDeepika", 29));

    System.out.println("Compable comparison sorting");
    System.out.println(ts); // Comparable comparison (Default natural order comparison)

    Set<Employee> ts1 = new TreeSet<>(new ComparableExWithEmployee().new EmployeeNameComparator());
    ts1.add(new Employee(105, "Sushmanth", 27));
    ts1.add(new Employee(110, "AnnaDeepika", 29));
    ts1.add(new Employee(108, "Kannan", 26));
    ts1.add(new Employee(100, "Surendar", 27));
    ts1.add(new Employee(112, "Saleem", 25));
    ts1.add(new Employee(100, "Surendar.D", 28));

    // Below one is duplicate. So, it won't allow
    ts1.add(new Employee(110, "AnnaDeepika", 29));

    System.out.println("Comparator comparison sorting");
    System.out.println(ts1); // Comparator comparison (our own customized comparison)
  }
}

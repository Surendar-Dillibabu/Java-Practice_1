package main.java8.ex.pgms.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsGroupingByEx1 {

  public static void main(String[] args) {
    List<Student> ls = new ArrayList<>();
    ls.add(new Student(10L, "Surendar", 01));
    ls.add(new Student(11L, "Ram", 02));
    ls.add(new Student(12L, "Tamil", 03));
    ls.add(new Student(14L, "Vivek", 01));
    ls.add(new Student(15L, "Sushmanth", 02));

    // Group by using complete student as a list
    Map<Integer, List<Student>> mp = ls.stream().collect(Collectors.groupingBy(Student::getDeptId));
    System.out.println("Map :" + mp);

    Map<String, Long> mp1 = ls.stream().collect(Collectors.groupingBy((a) -> {
      return "Dept_id:" + a.getDeptId();
    }, Collectors.counting()));
    System.out.println("Map :" + mp1);
    
    Map<String, Set<String>> mp2 = ls.stream().collect(Collectors.groupingBy((a) -> {
      return "Dept_id:" + a.getDeptId();
    }, Collectors.mapping(Student::getStudentName, Collectors.toSet())));
    System.out.println("Map :" + mp2);
  }
}

package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMappingEx {

  public static void main(String[] args) {
    List<Person> list = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
        new Person("David", 12));

    List<String> personNames = list.stream().collect(Collectors.mapping(Person::getName, Collectors.toList()));
    System.out.println("personNames :" + personNames);
  }
}

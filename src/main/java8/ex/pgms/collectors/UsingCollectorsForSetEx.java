package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UsingCollectorsForSetEx {

  public static void main(String[] args) {
    String[] nameArr = { "Surendar", "Ram", "Tamil", "Vivek", "Ram", "Vivek" };

    // It returns the set which is not guarantee about the type of set. Either
    // HashSet or LinkedHashSet
    Set<String> nameSet = Arrays.stream(nameArr).distinct().collect(Collectors.toSet());
    System.out.println("nameSet :" + nameSet);

    LinkedHashSet<String> nameLinkedHashSet = Arrays.stream(nameArr).distinct()
        .collect(Collectors.toCollection(LinkedHashSet::new));
    System.out.println("nameLinkedHashSet :" + nameLinkedHashSet);
  }
}

package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsingCollectorsForMapEx {

  public static void main(String[] args) {
    String[] nameArr = { "Surendar", "Ram", "Tamil", "Vivek", "Ram", "Vivek" };

    // It returns the map which is not guarantee about the type of Map. Either
    // HashMap or LinkedHashMap. In this case of toMap we have to handle the
    // duplication carefully.
    // If we are using toMap(Function keyMapper, Function valueMapper) we have to
    // handle the duplication by distinct otherwise if we have any duplicates then
    // it will throw IllegalStateException while doing the mapping
    Map<String, Integer> nameMap = Arrays.stream(nameArr).distinct()
        .collect(Collectors.toMap(Function.identity(), String::length));
    System.out.println("nameMap :" + nameMap);

    // If you don't want to handle using distinct method then you can specify it
    // using the toMap method which handle duplicates by merging the old value with
    // new value or something like you want
    Map<String, String> nameMapWithoutDupUsingToMap = Arrays.stream(nameArr)
        .collect(Collectors.toMap(Function.identity(), s -> {
          return s.concat("-").concat(String.valueOf(s.length()));
        }, (k, v) -> k + "," + v));
    System.out.println("nameMapWithoutDupUsingToMap :" + nameMapWithoutDupUsingToMap);

    // If you want specific map like HashMap or LinkedHashMap you can use another
    // method
    LinkedHashMap<String, String> nameLinkedHashMap = Arrays.stream(nameArr)
        .collect(Collectors.toMap(Function.identity(), s -> {
          return s.concat("-").concat(String.valueOf(s.length()));
        }, (k, v) -> k + "," + v, LinkedHashMap::new));
    System.out.println("nameLinkedHashMap :" + nameLinkedHashMap);
  }
}

package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsingCollectorsForConcurrentMapEx {

  public static void main(String[] args) {
    String[] nameArr = { "Surendar", "Ram", "Tamil", "Vivek", "Ram", "Vivek" };

    // It returns the ConcurrentMap which is not guarantee about the type of Map.
    // Either
    // ConcurrentHashMap or other types. In this case of toMap we have to handle the
    // duplication carefully.
    // If we are using toConcurrentMap(Function keyMapper, Function valueMapper) we
    // have to
    // handle the duplication by distinct otherwise if we have any duplicates then
    // it will throw IllegalStateException while doing the mapping
    Map<String, Integer> nameConcurrentMap = Arrays.stream(nameArr).distinct()
        .collect(Collectors.toConcurrentMap(Function.identity(), String::length));
    System.out.println("nameConcurrentMap :" + nameConcurrentMap);

    // If you don't want to handle using distinct method then you can specify it
    // using the toConcurrentMap method which handle duplicates by merging the old
    // value with
    // new value or something like you want
    Map<String, String> nameConcurrentMapWithoutDupUsingToConcurrentMap = Arrays.stream(nameArr)
        .collect(Collectors.toConcurrentMap(Function.identity(), s -> {
          return s.concat("-").concat(String.valueOf(s.length()));
        }, (k, v) -> k + "," + v));
    System.out
        .println("nameConcurrentMapWithoutDupUsingToConcurrentMap :" + nameConcurrentMapWithoutDupUsingToConcurrentMap);

    // If you want specific map like HashMap or LinkedHashMap you can use another
    // method
    ConcurrentHashMap<String, String> nameConcurrentHashMap = Arrays.stream(nameArr)
        .collect(Collectors.toConcurrentMap(Function.identity(), s -> {
          return s.concat("-").concat(String.valueOf(s.length()));
        }, (k, v) -> k + "," + v, ConcurrentHashMap::new));
    System.out.println("nameConcurrentHashMap :" + nameConcurrentHashMap);
  }
}

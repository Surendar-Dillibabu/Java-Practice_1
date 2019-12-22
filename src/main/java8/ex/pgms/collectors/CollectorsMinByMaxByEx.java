package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinByMaxByEx {

  public static void main(String[] args) {
    int[] numArr = { 10, 5, 87, 20, 6 };
    Optional<Integer> minValue = Arrays.stream(numArr).mapToObj(Integer::valueOf)
        .collect(Collectors.minBy(Integer::compareTo));
    System.out.println("minValue :" + minValue.get());
    Optional<Integer> maxValue = Arrays.stream(numArr).mapToObj(Integer::valueOf)
        .collect(Collectors.maxBy(Integer::compareTo));
    System.out.println("maxValue :" + maxValue.get());
  }
}

package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CollectorsSummingEx {

  public static void main(String[] args) {
    int[] numArr = { 10, 5, 87, 20, 6 };
    Integer sum = Arrays.stream(numArr).mapToObj(Integer::valueOf).collect(Collectors.summingInt(a -> a));
    System.out.println("sum :" + sum);

    double[] numArr1 = { 10.58, 54.8, 87, 20.0, 6.5, 78.50, 25 };
    Double sum1 = Arrays.stream(numArr1).mapToObj(Double::valueOf).collect(Collectors.summingDouble(a -> a));
    System.out.println("sum1 :" + sum1);

    long[] numArr2 = { 10l, 5l, 87l, 20l, 6l, 82, 45l };
    Long sum2 = Arrays.stream(numArr2).mapToObj(Long::valueOf).collect(Collectors.summingLong(a -> a));
    System.out.println("sum2 :" + sum2);
  }
}

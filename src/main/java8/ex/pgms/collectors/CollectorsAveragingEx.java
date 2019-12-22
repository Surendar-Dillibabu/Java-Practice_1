package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CollectorsAveragingEx {

  public static void main(String[] args) {
    int[] numArr = { 10, 5, 87, 20, 6 };
    Double average = Arrays.stream(numArr).mapToObj(Integer::valueOf).collect(Collectors.averagingInt(a -> a));
    System.out.println("average :" + average);

    double[] numArr1 = { 10.58, 54.8, 87, 20.0, 6.5, 78.50, 25 };
    Double average1 = Arrays.stream(numArr1).mapToObj(Double::valueOf).collect(Collectors.averagingDouble(a -> a));
    System.out.println("average1 :" + average1);

    long[] numArr2 = { 10l, 5l, 87l, 20l, 6l, 82, 45l };
    Double average2 = Arrays.stream(numArr2).mapToObj(Long::valueOf).collect(Collectors.averagingLong(a -> a));
    System.out.println("average2 :" + average2);

  }
}

package main.java8.ex.pgms.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsPartitionByEx {

  public static void main(String[] args) {
    Map<Boolean, List<Integer>> map = IntStream.range(1, 10).mapToObj(Integer::new)
        .collect(Collectors.partitioningBy(num -> num % 2 == 0));
    System.out.println("Map :" + map);

    Stream<String> s = Stream.of("Ace", "heart", "Club", "diamond");
    Map<Boolean, Long> m = s
        .collect(Collectors.partitioningBy(x -> Character.isUpperCase(x.charAt(0)), Collectors.counting()));
    System.out.println(m);

  }
}

package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class CollectWithSupplierAccumulatorCombinerFinisher {

  public static void main(String[] args) {
    List<Person> list = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
        new Person("David", 12));

    Collector<Person, StringJoiner, String> collector = Collector.of(() -> new StringJoiner("|"), (j1, p) -> {
      j1.add(p.name.toUpperCase());
    }, (j1, j2) -> {
      return j1.merge(j2);
    }, StringJoiner::toString);

    String result = list.stream().collect(collector);
    System.out.println("result :"+result);
  }
}

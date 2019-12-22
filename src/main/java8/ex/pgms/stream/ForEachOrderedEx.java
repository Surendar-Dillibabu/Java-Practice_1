package main.java8.ex.pgms.stream;

import java.util.stream.Stream;

public class ForEachOrderedEx {

  public static void main(String[] args) {
    // Won't maintains the order
    System.out.println("forEach example");
    Stream.of("AAA", "BBB", "CCC", "DDD", "EEE").parallel().forEach(s -> {
      System.out.println("Output:" + s + "- Thread name -" + Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    // Maintains the order. But sometimes it leads to sacrificing the benefit of
    // parallelism
    System.out.println("forEachOrdered example");
    Stream.of("AAA", "BBB", "CCC", "DDD", "EEE").parallel().forEachOrdered(s -> {
      System.out.println("Output:" + s + "- Thread name -" + Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

  }
}

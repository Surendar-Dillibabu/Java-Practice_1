package main.java8.ex.pgms.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleConsumer;

public class DoubleConsumerEx {

  public static void main(String[] args) {
    List<Double> ls = new ArrayList<>();
    ls.add(10.50);
    ls.add(50.0);
    ls.add(30.75);

    DoubleConsumer doubleConsumer = (a) -> {
      int count = (int) ls.stream().filter(b -> a == b).count();
      if (count == 0) {
        ls.add(a);
      }
    };

    System.out.println("Before call to consumer :" + ls);
    doubleConsumer.accept(10.10);
    System.out.println("After call to consumer :" + ls);
  }
}

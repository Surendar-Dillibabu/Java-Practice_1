package main.java8.ex.pgms.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;

public class IntConsumerEx {

  public static void main(String[] args) {
    List<Integer> ls = new ArrayList<>();
    ls.add(10);
    ls.add(50);
    ls.add(30);

    IntConsumer intConsumer = (a) -> {
      int count = (int) ls.stream().filter(b -> a == b).count();
      if (count == 0) {
        ls.add(a);
      }
    };

    System.out.println("Before call to consumer :" + ls);
    intConsumer.accept(60);
    System.out.println("After call to consumer :" + ls);
  }
}

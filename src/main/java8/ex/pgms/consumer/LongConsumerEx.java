package main.java8.ex.pgms.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongConsumer;

public class LongConsumerEx {

  public static void main(String[] args) {
    List<Long> ls = new ArrayList<>();
    ls.add(10L);
    ls.add(50L);
    ls.add(30L);

    LongConsumer longConsumer = (a) -> {
      int count = (int) ls.stream().filter(b -> a == b).count();
      if (count == 0) {
        ls.add(a);
      }
    };

    System.out.println("Before call to consumer :" + ls);
    longConsumer.accept(10L);
    System.out.println("After call to consumer :" + ls);
  }
}

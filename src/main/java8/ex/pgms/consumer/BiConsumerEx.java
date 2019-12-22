package main.java8.ex.pgms.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerEx {

  public static void main(String[] args) {
    List<String> ls1 = new ArrayList<>();
    ls1.add("Surendar");
    ls1.add("Ram");
    ls1.add("Tamil");
    ls1.add("Vivek");

    List<String> ls2 = new ArrayList<>();
    ls2.add("Tamil");
    ls2.add("Surendar");
    ls2.add("Ram");

    BiConsumer<List<String>, List<String>> biConsumerAction = (list1, list2) -> {
      list1.stream().filter(e -> (list2.stream().filter(d -> d.equals(e)).count()) >= 1).forEach(System.out::println);
    };

    biConsumerAction.accept(ls1, ls2);

  }
}

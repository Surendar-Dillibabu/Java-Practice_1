package main.java8.ex.pgms.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Surendar");
    ls.add("Ram");
    ls.add("Tamil");
    ls.add("Vivek");

    Consumer<String> consumerAction = (a) -> {
      System.out.println(a);
    };

    ls.forEach(consumerAction);
  }
}

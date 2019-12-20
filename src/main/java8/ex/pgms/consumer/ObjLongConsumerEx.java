package main.java8.ex.pgms.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ObjLongConsumer;

public class ObjLongConsumerEx {

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Surendar");
    ls.add("Ram");
    ls.add("Tamil");
    ls.add("Vivek");

    ObjLongConsumer<List<String>> objLongConsumer = (list, num) -> {
      list.stream().map(e -> e.concat("-").concat(String.valueOf(num))).forEach(System.out::println);
    };

    objLongConsumer.accept(ls, 50L);
  }
}

package main.java8.ex.pgms.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerEx {

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Surendar");
    ls.add("Ram");
    ls.add("Tamil");
    ls.add("Vivek");

    ObjDoubleConsumer<List<String>> objDoubleConsumer = (list, num) -> {
      list.stream().map(e -> e.concat("-").concat(String.valueOf(num))).forEach(System.out::println);
    };

    objDoubleConsumer.accept(ls, 50.58);
  }
}

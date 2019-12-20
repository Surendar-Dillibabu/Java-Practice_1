package main.java8.ex.pgms.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierEx {

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Surendar");
    ls.add("Ram");
    ls.add("Tamil");
    ls.add("Vivek");

    Supplier<List<String>> ls1 = () -> {
      return ls.stream().filter(a -> a.charAt(1) == 'a').collect(Collectors.toList());
    };

    System.out.println(ls1.get());
  }
}

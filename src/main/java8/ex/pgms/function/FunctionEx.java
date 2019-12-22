package main.java8.ex.pgms.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Function accepts one input and return one output of any type
 * @author Surendar
 *
 */
public class FunctionEx {

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Surendar");
    ls.add("Ram");
    ls.add("Tamil");
    ls.add("Vivek");

    Function<List<String>, Long> function = (list) -> {
      return list.stream().filter(a -> a.length() >= 5).count();
    };

    System.out.println("Function example :" + function.apply(ls));
  }
}

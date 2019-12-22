package main.java8.ex.pgms.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * BiFunction accepts two input arguments and return one output argument
 * 
 * @author Surendar
 *
 */
public class BiFunctionEx {

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Tamil");
    ls.add("Surendar");
    ls.add("Vivek");
    ls.add("Ram");

    List<String> ls1 = new ArrayList<>();
    ls1.add("Surendar");
    ls1.add("Ram");
    ls1.add("Tamil");
    ls1.add("Vivek");

    BiFunction<List<String>, List<String>, Boolean> biFunction = (list1, list2) -> {
      return list1.stream().allMatch(a -> {
        // System.out.println("a :" + a);
        return (list2.stream().anyMatch(b -> {
          // System.out.println("b :" + b);
          return a.equals(b);
        }));
      });
    };

    System.out.println("BiFunction example :" + biFunction.apply(ls, ls1));
  }
}

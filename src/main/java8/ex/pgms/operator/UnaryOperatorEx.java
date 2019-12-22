package main.java8.ex.pgms.operator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * UnaryOperator extends Function<T, R>. But in Function interface it allows
 * different arguments for both input and output. But in UnaryOpeator takes both
 * input and output as same type
 * 
 * @author Surendar
 *
 */
public class UnaryOperatorEx {

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Surendar");
    ls.add("Ram");
    ls.add("Tamil");
    ls.add("Vivek");

    UnaryOperator<List<String>> unaryOperator = (list) -> {
      return list.stream().filter(a -> a.length() >= 5).collect(Collectors.toList());
    };

    List<String> ls1 = unaryOperator.apply(ls);
    System.out.println("ls1 :" + ls1);
  }
}

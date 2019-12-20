package main.java8.ex.pgms.predicate;

import java.util.function.DoublePredicate;

public class DoublePredicateEx {
  public static void main(String[] args) {
    DoublePredicate doublePredicate = (a) -> {
      return (a == 10) ? true : false;
    };

    System.out.println("Simple DoublePredicate result :" + doublePredicate.test(10.0));

    System.out.println("DoublePredicate And result :" + doublePredicate.and(a -> a > 5).test(10.50));

    System.out.println("DoublePredicate Or result :" + doublePredicate.or(a -> a > 5).test(7.5));

    System.out.println("DoublePredicate Negate result :" + doublePredicate.negate().test(15.5));
  }
}

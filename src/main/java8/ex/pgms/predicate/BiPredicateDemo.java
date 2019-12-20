package main.java8.ex.pgms.predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

  public static void main(String[] args) {
    BiPredicate<Integer, String> equalPredicate = (a, b) -> {
      if (a == Integer.parseInt(b))
        return true;
      return false;
    };

    System.out.println("Equal BiPredicate result :" + equalPredicate.test(2, "2"));

    BiPredicate<Integer, String> greaterThanPredicate = (a, b) -> {
      if (a > Integer.parseInt(b))
        return true;
      return false;
    };
    System.out.println("Greater than BiPredicate result :" + greaterThanPredicate.test(2, "3"));

    BiPredicate<Integer, String> andPredicate = equalPredicate.and(greaterThanPredicate);
    System.out.println("And predicate result :" + andPredicate.test(2, "3"));

    BiPredicate<Integer, String> orPredicate = equalPredicate.or(greaterThanPredicate);
    System.out.println("Or BiPredicate result :" + orPredicate.test(5, "3"));

    BiPredicate<Integer, String> negatePredicate = (a, b) -> {
      return !(a > Integer.parseInt(b));
    };
    System.out.println("Negate BiPredicate result :" + negatePredicate.test(5, "3"));
  }
}

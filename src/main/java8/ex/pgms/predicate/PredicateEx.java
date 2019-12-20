package main.java8.ex.pgms.predicate;

import java.util.function.Predicate;

public class PredicateEx {

  public static void main(String[] args) {
    Predicate<Integer> predicate = (a) -> {
      return a > 10;
    };

    System.out.println("Simple predicate result :" + predicate.test(15));

    Predicate<Integer> equalPredicate = (a) -> {
      if (a == 10)
        return true;
      return false;
    };

    System.out.println("Equal predicate result :" + equalPredicate.test(2));

    Predicate<Integer> greaterThanPredicate = (a) -> {
      if (a > 10)
        return true;
      return false;
    };
    System.out.println("Greater than predicate result :" + greaterThanPredicate.test(15));

    Predicate<Integer> andPredicate = equalPredicate.and(greaterThanPredicate);
    System.out.println("And predicate result :" + andPredicate.test(20));

    Predicate<Integer> orPredicate = equalPredicate.or(greaterThanPredicate);
    System.out.println("Or predicate result :" + orPredicate.test(10));

    Predicate<Integer> negatePredicate = (a) -> {
      return !(a > 50);
    };
    System.out.println("Negate predicate result :" + negatePredicate.test(5));
  }
}

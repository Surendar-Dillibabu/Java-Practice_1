package main.java8.ex.pgms.predicate;

import java.util.function.LongPredicate;

public class LongPredicateEx {

  public static void main(String[] args) {
    LongPredicate longPredicate = (a) -> {
      return (a == 10) ? true : false;
    };

    System.out.println("Simple LongPredicate result :" + longPredicate.test(10L));

    System.out.println("LongPredicate And result :" + longPredicate.and(a -> a > 5).test(10L));

    System.out.println("LongPredicate Or result :" + longPredicate.or(a -> a > 5).test(7L));

    System.out.println("LongPredicate Negate result :" + longPredicate.negate().test(10L));
  }
}

package main.java8.ex.pgms.predicate;

import java.util.function.IntPredicate;

public class IntPredicatEx {

  public static void main(String[] args) {
    IntPredicate intPrediate = (a) -> {
      return (a== 10) ? true : false;
    };
    
    System.out.println("Simple IntPredicate result :"+intPrediate.test(10));
    
    System.out.println("IntPredicate And result :"+intPrediate.and(a -> a > 5).test(10));
    
    System.out.println("IntPredicate Or result :"+intPrediate.or(a -> a > 5).test(7));
    
    System.out.println("IntPredicate Negate result :"+intPrediate.negate().test(10));
  }
}

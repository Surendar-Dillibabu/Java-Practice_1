package main.java8.ex.pgms.operator;

import java.util.function.BinaryOperator;

/**
 * BinaryOperator extends BiFunction<T,T,T>. So, it's method are internally
 * inherited to BinaryOperator. BinaryOperator contains maxBy and minBy function
 * which accepts comparator
 * 
 * @author Surendar
 *
 */
public class BinaryOperatorEx {

  public static void main(String[] args) {
    BinaryOperator<Integer> biOperator = (a, b) -> {
      return (a + b);
    };
    System.out.println("Sum of two numbers using BiFunction apply :" + biOperator.apply(10, 20));

    BinaryOperator<Integer> biOperator1 = BinaryOperator.maxBy((a, b) -> {
      return a > b ? 1 : ((a == b) ? 0 : -1);
    });

    System.out.println("Max of two numbers using BinaryOperator maxBy method :" + biOperator1.apply(10, 20));

    BinaryOperator<Integer> biOperator2 = BinaryOperator.minBy((a, b) -> {
      return a > b ? 1 : ((a == b) ? 0 : -1);
    });

    System.out.println("Min of two numbers using BinaryOperator minBy method :" + biOperator2.apply(10, 20));
  }
}

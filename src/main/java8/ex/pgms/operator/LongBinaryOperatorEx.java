package main.java8.ex.pgms.operator;

import java.util.function.LongBinaryOperator;

/**
 * Accepts two Long input params and produce a Long Output
 * 
 * @author Surendar
 *
 */
public class LongBinaryOperatorEx {
  public static void main(String[] args) {
    LongBinaryOperator lBiOperator = (a, b) -> {
      return a + b;
    };

    System.out.println("Long binary operator :" + lBiOperator.applyAsLong(10L, 20L));
  }
}

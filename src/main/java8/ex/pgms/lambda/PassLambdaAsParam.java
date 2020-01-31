package main.java8.ex.pgms.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PassLambdaAsParam {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(50);
    numbers.add(2);
    numbers.add(8);
    numbers.add(30);

    // sum of all numbers
    System.out.println(sumWithCondition(numbers, n -> true));
    
    // sum of all even numbers
    System.out.println(sumWithCondition(numbers, i -> i % 2 == 0));
    
    // sum of all numbers greater than 5
    System.out.println(sumWithCondition(numbers, i -> i > 5));
  }

  public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
    return numbers.parallelStream().filter(predicate).mapToInt(i -> i).sum();
  }
}

package main.java8.ex.pgms.lambda;

import java.util.stream.IntStream;

public class DeclarativeApproachEx {
  
  public static void main(String[] args) {
    boolean primeFlag1 = isPrime(999983);
    System.out.println("primeFlag1 :"+primeFlag1);
    
    boolean primeFlag2 = isPrimeWithLambda(999983);
    System.out.println("primeFlag2 :"+primeFlag2);
  }
  

  /*
   * Traditional approach. Problem with this approach is it is sequential in
   * nature. What happened if we have the huge number. It has to wait to process
   * one by one
   */
  private static boolean isPrime(int number) {
    if (number < 2)
      return false;
    for (int i = 2; i < number; i++) {
      if (number % i == 0)
        return false;
    }
    return true;
  }

  /*
   * Declarative approach. In this approach it won't process the input as a
   * sequential one. It will parallely check all the values if any of the values
   * match it will immediately come out
   * 
   */
  private static boolean isPrimeWithLambda(int number) {
    return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
  }
}

package main.interview.pgms;

public class FibonacciEx {

  public static int fib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    return fib(n - 1) + fib(n - 2);
  }

  public static void main(String args[]) {
    System.out.println("Fibonacci series for first 5 numbers :");
    for (int lp1 = 0; lp1 <= 5; lp1++) {
      System.out.print(fib(lp1) + " ");
    }
  }
}

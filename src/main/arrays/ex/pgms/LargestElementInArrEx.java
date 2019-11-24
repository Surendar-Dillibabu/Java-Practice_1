package main.arrays.ex.pgms;

public class LargestElementInArrEx {

  public static void main(String args[]) {
    int numbers[] = { 5, 3, 9, 54, 1, 7, 62 };
    int max = numbers[0];
    for (int lp1 = 1; lp1 < numbers.length; lp1++) {
      if (numbers[lp1] > max) {
        max = numbers[lp1];
      }
    }
    System.out.println("Largest element is " + max);
  }
}

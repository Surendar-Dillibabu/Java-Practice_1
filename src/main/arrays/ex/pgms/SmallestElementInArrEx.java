package main.arrays.ex.pgms;

public class SmallestElementInArrEx {

  public static void main(String args[]) {
    int numbers[] = { 5, 3, 9, 54, 10, 7, 62 };
    int min = numbers[0];
    for (int lp1 = 1; lp1 < numbers.length; lp1++) {
      if (numbers[lp1] < min) {
        min = numbers[lp1];
      }
    }
    System.out.println("Smallest element is " + min);
  }
}

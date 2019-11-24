package main.arrays.ex.pgms;

import java.util.Arrays;

public class SortElementsInDescEx {

  public static void main(String args[]) {
    int numbers[] = new int[] { 1, 15, 7, 8, 12, 3 };

    System.out.println("Before sorting the elements");
    Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
    System.out.println();

    int temp = 0;
    for (int lp1 = 0; lp1 < numbers.length; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < numbers.length; lp2++) {
        if (numbers[lp2] > numbers[lp1]) {
          temp = numbers[lp1];
          numbers[lp1] = numbers[lp2];
          numbers[lp2] = temp;
        }
      }
    }

    System.out.println("After sorting the elements");
    Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
  }
}

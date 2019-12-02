package main.interview.pgms;

import java.util.Arrays;

public class AlternatePositiveNegativeSortingEx {

  public static void main(String[] args) {
    int[] numArr = { 1, 2, 3, -4, -1, 4, -8, -7, 5, 18 }; // { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
    Arrays.sort(numArr);
    
    System.out.println(Arrays.toString(numArr));
  }
}

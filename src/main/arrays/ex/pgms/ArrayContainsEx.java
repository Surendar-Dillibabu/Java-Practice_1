package main.arrays.ex.pgms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayContainsEx {

  public static void main(String[] args) throws IOException {
    Integer numArr[] = new Integer[] { 3, 60, 35, 2, 45, 320, 5 };
    Integer num = 0;
    boolean containsFlag = false;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("Enter the number to find it in array :");
      num = Integer.parseInt(br.readLine());
      for (int lp1 = 0; lp1 < numArr.length; lp1++) {
        if (numArr[lp1] == num) {
          containsFlag = true;
          break;
        }
      }
    }

    System.out
        .println("The given number " + num + (containsFlag ? " present in the array" : " not present in the array"));

    System.out.println("Using arraylist to find the number");
    System.out.println("The given number " + num
        + (Arrays.asList(numArr).contains(num) ? " present in the array" : " not present in the array"));
  }

}

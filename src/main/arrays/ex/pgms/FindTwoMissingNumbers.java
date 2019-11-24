package main.arrays.ex.pgms;

import java.util.BitSet;

public class FindTwoMissingNumbers {

  public static void main(String[] args) {

    printMissingNumbers(new int[] { 1, 2, 3, 4, 6, 9, 8 }, 10); // three missing numbers

    printMissingNumbers(new int[] { 1, 2, 3, 4, 9, 8 }, 10); // four missing numbers
  }

  public static void printBits(String prompt, BitSet b) {
    System.out.print(prompt + " ");
    for (int i = 0; i < b.length(); i++) {
      System.out.print(b.get(i) ? "1" : "0");
    }
    System.out.println();
  }

  public static void printMissingNumbers(int[] numArr, int totalNumCount) {
    int missingCount = totalNumCount - numArr.length;
    BitSet bs = new BitSet(totalNumCount);

    // setting the bit value with array value
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      bs.set(numArr[lp1] - 1);
    }

    printBits("After setting the bit value :", bs);

    System.out.println("Missing count :" + missingCount);

    int lastMissingIndex = 0;
    System.out.println("Missing numbers are :");
    for (int lp1 = 0; lp1 < missingCount; lp1++) {
      lastMissingIndex = bs.nextClearBit(lastMissingIndex) + 1;
      System.out.println(lastMissingIndex);
    }
  }
}

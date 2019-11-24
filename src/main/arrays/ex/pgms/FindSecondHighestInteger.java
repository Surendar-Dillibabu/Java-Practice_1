package main.arrays.ex.pgms;

import java.util.Arrays;

public class FindSecondHighestInteger {

  public static void main(String[] args) {
    FindSecondHighestInteger obj = new FindSecondHighestInteger();
    int[] numArr = new int[] { 2, 9, 5, 4, 7, 10, 1, 3 };

    // Easiest way to find the second highest number
    Arrays.sort(numArr);
    System.out.println("Find second highest number using Arrays class sort method :" + numArr[numArr.length - 2]);

    int[] numArr1 = new int[] { 2, 10, 5, 4, 7, 9, 1, 3 };
    System.out.println("Find second highest number without sorting :" + obj.getSecondHighestNumber(numArr1));

    // Using customized sorting to find the second highest number
    obj.sortArray(numArr1);
    System.out.println("Find second highest number using customized sorting :" + numArr1[numArr1.length - 2]);
  }

  public void sortArray(int[] numArr) {
    int min = 0;
    int temp = 0;
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      min = numArr[lp1];
      for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if (min > numArr[lp2]) {
          temp = numArr[lp2];
          numArr[lp2] = min;
          numArr[lp1] = temp;
          min = numArr[lp1];
        }
      }
    }
  }

  public int getSecondHighestNumber(int[] numArr) {
    int firstHighest = numArr[0];
    int secondHighest = 0;
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      if (firstHighest < numArr[lp1]) {
        secondHighest = firstHighest;
        firstHighest = numArr[lp1];
      } else if (secondHighest < numArr[lp1]) {
        secondHighest = numArr[lp1];
      }
    }
    return secondHighest;
  }
}

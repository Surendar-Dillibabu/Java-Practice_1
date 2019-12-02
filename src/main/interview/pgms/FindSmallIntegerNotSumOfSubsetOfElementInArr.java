package main.interview.pgms;

public class FindSmallIntegerNotSumOfSubsetOfElementInArr {

  public static void main(String[] args) {
    int[] numArr = { 1, 2, 6, 10, 11, 15 };
    int smallInteger = 1;

    if (numArr != null && numArr.length > 0) {
      for (int lp1 = 0; lp1 < numArr.length && numArr[lp1] <= smallInteger; lp1++) {
        smallInteger = smallInteger + numArr[lp1];
      }

      System.out.println(
          "Smallest integer which is not represented as other subset of sum of elements in the array :" + smallInteger);
    }
  }
}

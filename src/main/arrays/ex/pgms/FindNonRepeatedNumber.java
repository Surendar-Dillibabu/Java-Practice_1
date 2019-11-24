package main.arrays.ex.pgms;

public class FindNonRepeatedNumber {

  public static void main(String[] args) {
    int[] numArr = { 2, 2, 5, 5, 7, 7, 3, 10, 10, 9, 9 };
    int nonRepeatedNum = 0;

    for (int lp1 = 0; lp1 < numArr.length; lp1 = lp1 + 2) {
      if (numArr[lp1] != numArr[numArr.length > (lp1 + 1) ? (lp1 + 1) : lp1]) {
        nonRepeatedNum = numArr[lp1];
        break;
      }
    }
    System.out.println("Non repeated number :" + nonRepeatedNum);
  }
}

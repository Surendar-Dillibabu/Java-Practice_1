package main.arrays.ex.pgms;

public class FindMissingNumber {

  public static void main(String[] args) {
    int[] numArr = new int[] { 2, 9, 5, 4, 7, 8, 1, 3 };
    int sumTotal = 0;
    int seqTotal = (numArr.length + 1) * (numArr.length + 2) / 2; // Formula (n + 1) * (n + 2)/ 2
    // int seqTotal = (numArr.length + 1);
    for (int lp1 = 1; lp1 <= numArr.length; lp1++) {
      // seqTotal += lp1;
      sumTotal += numArr[lp1 - 1];
    }
    int missingNum = (seqTotal - sumTotal); // (55 - 49) = 6
    System.out.println("Missing number in the arry is " + missingNum);
  }
}

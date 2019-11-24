package main.arrays.ex.pgms;

public class FindDuplicateNumber {

  public static void main(String[] args) {
    int[] numArr = new int[] { 0, 2, 9, 14, 4, 7, 8, 0 }; // Number 0 also present in the loop
    int duplicateNumber = 0;
    int loopCount = 0;
    int arrLength = numArr.length;
    // Formula - ((n - 1) * (n - 2) / 2) + (n - 1)
    int seqTotal = ((arrLength - 1) * (arrLength - 2) / 2) + (arrLength - 1);

    outer: for (int lp1 = 0; lp1 < arrLength; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < arrLength; lp2++) {
        if (numArr[lp1] == numArr[lp2]) {
          duplicateNumber = numArr[lp1];
          break outer;
        } else {
          loopCount++;
        }
      }
    }

    // Here based on the loop count we are finding the
    if (loopCount == seqTotal) {
      System.out.println("No duplicates present in the array");
    } else {
      System.out.println("Duplicate number present in the array is :" + duplicateNumber);
    }
  }
}

package main.arrays.ex.pgms;

public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] numArr = new int[] { 1, 2, 1, 5, 8, 5, 9, 7, 3, 8, 10, 15, 17, 9 };
    int noOfDuplicates = 0;

    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if (numArr[lp1] == numArr[lp2]) {
          noOfDuplicates++;
        }
      }
    }

    System.out.println("Number of duplicates present in the array :" + noOfDuplicates);

    int[] nonDuplicatesArr = new int[numArr.length - noOfDuplicates];
    int insertedCount = 0;
    boolean duplicateFlag = false;
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      duplicateFlag = false;
      for (int lp2 = 0; lp2 < insertedCount; lp2++) {
        if (nonDuplicatesArr[lp2] == numArr[lp1]) {
          duplicateFlag = true;
          break;
        }
      }
      if (duplicateFlag == false) {
        nonDuplicatesArr[insertedCount++] = numArr[lp1];
      }
    }

    System.out.println("Non duplicates elements present in the new array :");
    for (int num : nonDuplicatesArr) {
      System.out.print(num + " ");
    }
  }
}

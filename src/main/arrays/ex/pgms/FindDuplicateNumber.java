package main.arrays.ex.pgms;

import java.util.HashSet;

public class FindDuplicateNumber {

  public static void main(String[] args) {
    FindDuplicateNumber obj = new FindDuplicateNumber();
    int[] numArr = new int[] { 0, 2, 9, 14, 4, 7, 8, 10, 9, 15 }; // Number 0 also present in the loop
    obj.findDuplicateNumberByLooping(numArr);
    // obj.findDuplicateNumByHashSet(numArr);
  }

  public void findDuplicateNumberByLooping(int[] numArr) {
    int duplicateNumber = 0;
    boolean duplicatePresent = false;
    int arrLength = numArr.length;

    outer: for (int lp1 = 0; lp1 < arrLength; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < arrLength; lp2++) {
        if (numArr[lp1] == numArr[lp2]) {
          duplicateNumber = numArr[lp1];
          duplicatePresent = true;
          break outer;
        }
      }
    }

    if (duplicatePresent) {
      System.out.println("Duplicate number present in the array is :" + duplicateNumber);
    } else {
      System.out.println("No duplicates present in the array");
    }
  }

  public void findDuplicateNumByHashSet(int[] numArr) {
    HashSet<Integer> hs = new HashSet<>(numArr.length);
    int duplicateNumber = 0;
    boolean duplicatePresent = false;
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      if (!hs.add(numArr[lp1])) {
        duplicatePresent = true;
        duplicateNumber = numArr[lp1];
      }
    }

    if (duplicatePresent) {
      System.out.println("Duplicate number present in the array is :" + duplicateNumber);
    } else {
      System.out.println("No duplicates present in the array");
    }
  }
}

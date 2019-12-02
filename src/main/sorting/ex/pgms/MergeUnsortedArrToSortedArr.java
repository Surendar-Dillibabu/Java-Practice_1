package main.sorting.ex.pgms;

import java.util.Arrays;

public class MergeUnsortedArrToSortedArr {

  public static void main(String[] args) {
    MergeUnsortedArrToSortedArr obj = new MergeUnsortedArrToSortedArr();
    int[] firstArr = new int[30];
    firstArr[0] = 5;
    firstArr[1] = 6;
    firstArr[2] = 9;
    firstArr[3] = 15;
    firstArr[4] = 21;
    firstArr[5] = 26;
    firstArr[6] = 35;
    firstArr[7] = 39;
    firstArr[8] = 65;
    firstArr[9] = 78;
    firstArr[10] = 91;
    firstArr[11] = 110;
    firstArr[12] = 150;
    firstArr[13] = 250;
    firstArr[14] = 265;
    firstArr[15] = 356;
    firstArr[16] = 500;
    firstArr[17] = 526;
    firstArr[18] = 645;
    firstArr[19] = 756;
    
    int[] newArr = firstArr.clone();
    System.out.println(Arrays.toString(newArr));

    int[] secondArr = new int[] { 80, 18, 12, 34, 60, 5, 8, 158, 267, 31 };

    obj.mergeArrays(firstArr, secondArr, 0, firstArr.length);

    System.out.println("Merged array values :");
    obj.printArray(firstArr);
  }

  public void printArray(int[] numArr) {
    for (int num : numArr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public void mergeArrays(int[] numArr1, int[] numArr2, int low, int high) {
    int mid = 0;
    for (int lp1 = 0; lp1 < numArr2.length; lp1++) {
      while (low < high) {
        mid = low + (high - low) / 2;
        if (numArr2[lp1] > numArr1[mid]) {
          low = (mid + 1);
        } else {
          high = mid;
        }
      }

      swapElements(numArr1, low, numArr2[lp1]);
      low = 0;
      high = numArr1.length;
    }
  }

  public void swapElements(int[] numArr1, int location, int element) {
    int temp = numArr1[location];
    for (int lp1 = location; lp1 < numArr1.length && element != 0; lp1++) {
      numArr1[lp1] = element;
      element = temp;
      temp = numArr1[numArr1.length == (lp1 + 1) ? (numArr1.length - 1) : (lp1 + 1)];
    }
  }
}

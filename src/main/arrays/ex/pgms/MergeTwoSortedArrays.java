package main.arrays.ex.pgms;

public class MergeTwoSortedArrays {

  public static void main(String[] args) {
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

    int[] secondArr = new int[] { 8, 12, 34, 60, 75, 80, 158, 267, 312, 420 };

    int low = 0;
    int high = firstArr.length;
    int midIndex = 0;
    int loopCount = 0;
    for (int lp1 = 0; lp1 < secondArr.length; lp1++) {
      loopCount++;
      midIndex = (low + high) / 2;
      if (secondArr[lp1] < firstArr[midIndex]) {
        high = midIndex - 1;
        lp1--;
      } else if (secondArr[lp1] > firstArr[midIndex + 1]) {
        low = midIndex + 1;
        lp1--;
      } else {
        low = midIndex + 1;
        high = firstArr.length;
        arrCopyMovement(firstArr, ++midIndex, secondArr[lp1]);
      }
    }
    System.out.println("Loop count :" + loopCount); // 32 loops

    System.out.println("Elements present in the main array after merge");
    for (int num : firstArr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void arrCopyMovement(int[] firstArr, int indexLocation, int element) {
    int nextValue = firstArr[indexLocation];
    for (int lp1 = indexLocation; lp1 < firstArr.length; lp1++) {
      firstArr[lp1] = element;
      element = nextValue;
      nextValue = firstArr[(lp1 + 1) == firstArr.length ? (firstArr.length - 1) : (lp1 + 1)];
    }
  }

}

package main.arrays.ex.pgms;

public class AlternatePositiveNegativeEx {

  public static void main(String[] args) {
    int[] numArr = { 1, 2, 3, -4, -1, 4, -8, -7, 5, 18 }; // { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
    int temp = 0;    
    boolean negativeFlag = false;
    boolean postiveFlag = true;
    boolean movementFlag = false;
    int negativeCount = 0;
    int positiveCount = 0;
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      if (numArr[lp1] >= 0) {
        positiveCount++;
      } else {
        negativeCount++;
      }
    }
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      negativeFlag = false;
      postiveFlag = false;
      movementFlag = false;
      if (lp1 % 2 == 0) {
        if (negativeCount != 0) {
          negativeFlag = true;
        } else if (positiveCount != 0) {
          postiveFlag = true;
        }
      } else {
        if (positiveCount != 0) {
          postiveFlag = true;
        } else if (negativeCount != 0) {
          negativeFlag = true;
        }
      }
      for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if ((negativeFlag && numArr[lp2] < 0 && numArr[lp2] < numArr[lp1])
            || (postiveFlag && numArr[lp2] >= 0 && (numArr[lp1] < 0 || numArr[lp2] < numArr[lp1]))) {
          temp = numArr[lp1];
          numArr[lp1] = numArr[lp2];
          numArr[lp2] = temp;
          movementFlag = true;
        }
      }
      if (movementFlag) {
        negativeCount = (negativeFlag ? (negativeCount - 1) : negativeCount);
        positiveCount = (postiveFlag ? (positiveCount - 1) : positiveCount);
      }
    }

    System.out.println("Rearranged array elements are :");
    for (int num : numArr) {
      System.out.print(num + " ");
    }
  }
}

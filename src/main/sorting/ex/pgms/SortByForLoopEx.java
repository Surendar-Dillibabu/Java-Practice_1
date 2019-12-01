package main.sorting.ex.pgms;

public class SortByForLoopEx {

  public static void main(String[] args) {
    // int[] numArr = { 10, 80, 30, 90, 40, 50, 70 };
    // int[] numArr = { 10, 8, 7, 5, 10, 7, 15, 28, 8 };
    int[] numArr = { 6, 5, 3, 1, 8, 7, 2, 4 };
    int loopCount = 0;
    SortByForLoopEx sortByLoop = new SortByForLoopEx();
    System.out.println("Before sorting the array :");
    sortByLoop.printArray(numArr);

    loopCount = sortByLoop.sort(numArr, loopCount);

    System.out.println("loopCount :" + loopCount);
    System.out.println("After sorting the array :");
    sortByLoop.printArray(numArr);
  }

  public void printArray(int[] numArr) {
    for (int num : numArr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public int sort(int[] numArr, int loopCount) {
    int temp = 0;
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if (numArr[lp1] > numArr[lp2]) {
          temp = numArr[lp2];
          numArr[lp2] = numArr[lp1];
          numArr[lp1] = temp;
        }
        loopCount++;
      }
    }
    return loopCount;
  }
}

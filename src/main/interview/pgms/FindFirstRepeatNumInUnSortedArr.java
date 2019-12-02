package main.interview.pgms;

public class FindFirstRepeatNumInUnSortedArr {

  public static void main(String[] args) {
    int[] numArr = { 10, 5, 3, 4, 3, 5, 6 };
    int firstRepeatNum = 0;

    outer: for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if (numArr[lp1] == numArr[lp2]) {
          firstRepeatNum = numArr[lp1];
          break outer;
        }
      }
    }
    System.out.println("First non repeating number is " + firstRepeatNum);
  }
}

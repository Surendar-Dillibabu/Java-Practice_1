package main.interview.pgms;

public class FindFirstNonRepeatNumInUnSortedArr {

  public static void main(String[] args) {
    int[] numArr = { 10, 5, 3, 4, 5, 10, 4 };
    boolean nonRepeatNumFlag = true;

    outer: for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      nonRepeatNumFlag = true;
      inner: for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if (numArr[lp1] == numArr[lp2]) {
          nonRepeatNumFlag = false;
          break inner;
        }
      }

      if (nonRepeatNumFlag) {
        System.out.println("First non repeating number is " + numArr[lp1]);
        break outer;
      }
    }
  }
}

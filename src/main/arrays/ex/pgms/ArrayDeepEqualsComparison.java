package main.arrays.ex.pgms;

public class ArrayDeepEqualsComparison {

  public static void main(String[] args) {
    ArrayDeepEqualsComparison obj = new ArrayDeepEqualsComparison();
    int[][] firstArr = new int[][] { { 80, 18, 12 }, { 34, 60 }, { 5, 8, 158, 267, 31 } };
    int[][] secondArr = new int[][] { { 80, 18, 12 }, { 34, 60 }, { 5, 8, 158, 267, 31 } };

    System.out
        .println("Both arrays are " + (obj.arrayDeepEqualsComparsion(firstArr, secondArr) ? "equal" : "not qual"));
  }

  public boolean arrayDeepEqualsComparsion(int[][] firstArr, int[][] secondArr) {
    boolean equalFlag = true;
    if (firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      outer: for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        if (firstArr[lp1].length == secondArr[lp1].length) {
          for (int lp2 = 0; lp2 < firstArr[lp1].length; lp2++) {
            if (firstArr[lp1][lp2] != secondArr[lp1][lp2]) {
              equalFlag = false;
              break outer;
            }
          }
        } else {
          equalFlag = false;
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }
}

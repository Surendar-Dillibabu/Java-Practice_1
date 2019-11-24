package main.arrays.ex.pgms;

public class ArrayEqualsComparison {

  public static void main(String[] args) {
    ArrayEqualsComparison obj = new ArrayEqualsComparison();
    int[] firstArr = new int[] { 80, 18, 12, 34, 60, 5, 8, 158, 267, 31 };
    int[] secondArr = new int[] { 80, 18, 12, 34, 60, 5, 8, 158, 267, 31 };

    System.out.println(firstArr == secondArr); // false - Since == operator will do reference comparison

    System.out.println(firstArr.equals(secondArr)); // false - Since it will consider default object comparison

    System.out.println("Both arrays are " + (obj.arrayEqualsComparsion(firstArr, secondArr) ? "equal" : "not qual"));
  }

  public boolean arrayEqualsComparsion(int[] firstArr, int[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        if (firstArr[lp1] != secondArr[lp1]) {
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

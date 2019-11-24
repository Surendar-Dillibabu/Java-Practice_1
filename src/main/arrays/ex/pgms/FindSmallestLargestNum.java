package main.arrays.ex.pgms;

public class FindSmallestLargestNum {

  public static void main(String[] args) {
    int numArr[] = new int[] { 3, 60, 35, 2, 45, 320, 5 };
    int smallest = numArr[0], largest = numArr[0];
    for (int lp1 = 1; lp1 < numArr.length; lp1++) {
      if (numArr[lp1] > largest) {
        largest = numArr[lp1];
      } else if (numArr[lp1] < smallest) {
        smallest = numArr[lp1];
      }
    }
    System.out.println("Largest number :" + largest);
    System.out.println("Smallest number :" + smallest);
  }
}

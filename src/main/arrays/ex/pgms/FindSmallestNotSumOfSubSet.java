package main.arrays.ex.pgms;

/**
 * Finding the smallest positive integers which is not subset of sum of elements
 * in the array
 * 
 * @author Surendar
 *
 */
public class FindSmallestNotSumOfSubSet {

  public static void main(String[] args) {
    FindSmallestNotSumOfSubSet small = new FindSmallestNotSumOfSubSet();
    int arr1[] = { 1, 3, 4, 5 };
    System.out.println("Smallest integer which is not subset of elements :" + small.findSmallestInteger(arr1));

    int arr2[] = { 1, 2, 6, 10, 11, 15 };
    System.out.println("Smallest integer which is not subset of elements :" + small.findSmallestInteger(arr2));

    int arr3[] = { 1, 1, 1, 1 };
    System.out.println("Smallest integer which is not subset of elements :" + small.findSmallestInteger(arr3));

    int arr4[] = { 1, 1, 3, 4 };
    System.out.println("Smallest integer which is not subset of elements :" + small.findSmallestInteger(arr4));
  }

  public int findSmallestInteger(int[] numArr) {
    int result = 1;

    for (int lp1 = 0; lp1 < numArr.length && numArr[lp1] <= result; lp1++) {
      result += numArr[lp1];
    }
    return result;
  }
}

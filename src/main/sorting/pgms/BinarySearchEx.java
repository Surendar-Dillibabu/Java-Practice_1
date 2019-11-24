package main.sorting.pgms;

import java.util.Arrays;

/**
 * Binary search is used to search a key element from multiple elements. Binary
 * search is faster than linear search. In case of binary search, array elements
 * must be in ascending order. If you have unsorted array, you can sort the
 * array using Arrays.sort(arr) method.
 * 
 * @author Surendar
 *
 */
public class BinarySearchEx {

  public static void main(String args[]) {
    BinarySearchEx binarySearchEx = new BinarySearchEx();
    int[] numArr = new int[] { 3, 60, 35, 2, 45, 320, 5 };
    Arrays.sort(numArr);
    int indexPos = binarySearchEx.binarySearch(numArr, 320, 0, (numArr.length - 1));
    System.out.println("The value 40 present in the index position :" + indexPos);
  }

  public int binarySearch(int[] numArr, int value, int first, int last) {
    if (last >= first) {
      int mid = (first + last) / 2;
      if (numArr[mid] < value) {
        return binarySearch(numArr, value, (mid + 1), last);
      } else if (numArr[mid] == value) {
        return mid;
      } else {
        return binarySearch(numArr, value, first, (mid - 1));
      }
    }
    return -1;
  }
}

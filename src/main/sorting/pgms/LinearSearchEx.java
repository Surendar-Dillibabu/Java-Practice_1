package main.sorting.pgms;

/**
 * Linear search is used to search a key element from multiple elements. Linear
 * search is less used today because it is slower than binary search and
 * hashing.
 * 
 * @author Surendar
 *
 */
public class LinearSearchEx {

  public static void main(String args[]) {
    LinearSearchEx linearSearchEx = new LinearSearchEx();
    int[] numArr = new int[] { 3, 60, 35, 2, 45, 320, 5 };
    int indexPos = linearSearchEx.linearSearch(numArr, 60);
    System.out.println("The value 60 present in the index position :" + indexPos);
  }

  public int linearSearch(int[] numArr, int value) {
    int indexPosition = -1;
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      if (numArr[lp1] == value) {
        indexPosition = lp1;
        break;
      }
    }
    return indexPosition;
  }
}

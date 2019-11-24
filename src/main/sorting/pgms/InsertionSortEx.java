package main.sorting.pgms;

/**
 * Insertion is good for small elements only because it requires more time for
 * sorting large number of elements. It is using shift technique to sort the
 * elements
 * 
 * @author Surendar
 *
 */
public class InsertionSortEx {

  public static void main(String args[]) {
    // int[] numArr = { 18, 9, 33, 4, 84, 32 };
    // int[] numArr = new int[] { 3, 60, 35, 2, 45, 320, 5 };
    int[] numArr = new int[] { 1, 3, 7, 9, 16, 5 };
    int key = 0, index = 0;
    for (int lp1 = 1; lp1 < numArr.length; lp1++) {
      key = numArr[lp1];
      index = lp1 - 1;
      while (index > -1 && numArr[index] > key) {
        numArr[index + 1] = numArr[index];
        index--;
      }
      numArr[index + 1] = key;
    }

    for (int num : numArr) {
      System.out.println(num);
    }
  }
}

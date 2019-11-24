package main.sorting.pgms;

/**
 * In selection sort algorithm, we search for the lowest element and arrange it
 * to the proper location. We swap the current element with the next lowest
 * number.
 * 
 * @author Surendar
 *
 */
public class SelectionSortEx {

  public static void main(String[] args) {
    // int[] numArr = { 18, 9, 33, 4, 84, 32 };
    int[] numArr = new int[] { 3, 60, 35, 2, 45, 320, 5 };
    int smallestNum = 0;
    int index = 0;
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      index = lp1;
      for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if (numArr[lp2] < numArr[index]) {
          index = lp2;
        }
      }
      smallestNum = numArr[index];
      numArr[index] = numArr[lp1];
      numArr[lp1] = smallestNum;
    }

    for (int num : numArr) {
      System.out.println(num);
    }
  }
}

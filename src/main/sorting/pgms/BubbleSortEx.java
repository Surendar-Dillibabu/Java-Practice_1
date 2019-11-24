package main.sorting.pgms;

/**
 * In bubble sort algorithm, array is traversed from first element to last
 * element. Here, current element is compared with the next element. If current
 * element is greater than the next element, it is swapped.
 * 
 * @author Surendar
 *
 */
public class BubbleSortEx {

  public static void main(String args[]) {
    // int[] numArr = { 18, 9, 33, 4, 84, 32 };
    int[] numArr = new int[] { 3, 60, 35, 2, 45, 320, 5 };
    int temp = 0;
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if (numArr[lp2] < numArr[lp1]) {
          temp = numArr[lp2];
          numArr[lp2] = numArr[lp1];
          numArr[lp1] = temp;
        }
      }
    }
    for (int num : numArr) {
      System.out.println(num);
    }
  }
}

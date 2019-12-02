package main.interview.pgms;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindCommonElementsInThreeSortedArr {

  public static void main(String[] args) {
    int[] numArr1 = { 1, 5, 10, 20, 30, 40, 80 };
    int[] numArr2 = { 6, 7, 20, 30, 80, 100 };
    int[] numArr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };

    Set<Integer> hs = new LinkedHashSet<>();
    int firstArrElement = 0, secArrStartPos = 0, secArrEndPos = 0, thirdArrStartPos = 0, thirdArrEndPos = 0;
    int secArrMidIndex = (numArr2.length / 2);
    int secArrMidElement = numArr2[secArrMidIndex];
    int thirdArrMidIndex = (numArr3.length / 2);
    int thirdArrMidElement = numArr3[thirdArrMidIndex];

    for (int lp1 = 0; lp1 < numArr1.length; lp1++) {
      firstArrElement = numArr1[lp1];

      if (firstArrElement < secArrMidElement) {
        secArrStartPos = 0;
        secArrEndPos = secArrMidIndex;
      } else {
        secArrStartPos = secArrMidIndex;
        secArrEndPos = numArr2.length;
      }

      secLoop: for (int lp2 = secArrStartPos; lp2 < secArrEndPos; lp2++) {
        if (firstArrElement < numArr2[lp2]) {
          break;
        } else if (firstArrElement == numArr2[lp2]) {

          if (numArr2[lp2] < thirdArrMidElement) {
            thirdArrStartPos = 0;
            thirdArrEndPos = thirdArrMidIndex;
          } else {
            thirdArrStartPos = thirdArrMidIndex;
            thirdArrEndPos = numArr3.length;
          }

          for (int lp3 = thirdArrStartPos; lp3 < thirdArrEndPos; lp3++) {

            if (numArr2[lp2] < numArr3[lp3]) {
              break secLoop;
            } else if (numArr2[lp2] == numArr3[lp3]) {
              hs.add(numArr1[lp1]);
              break secLoop;
            }
          }
        }
      }
    }

    System.out.println("Common elements present in the three array are :" + hs);
  }
}

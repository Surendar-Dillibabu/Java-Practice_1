package main.arrays.ex.pgms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsInArrEx {

  public static void main(String args[]) {
    RemoveDuplicateElementsInArrEx removeDuplicateElementsInArrEx = new RemoveDuplicateElementsInArrEx();
    Integer[] numbers = new Integer[] { 10, 20, 20, 30, 20, 40, 50, 50 };

    System.out.println("Array with duplicates");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
    System.out.println();

    // int[] arrWithoutDuplicates =
    // removeDuplicateElementsInArrEx.getArrayWithoutDuplicatesByForLoop(numbers);
    Integer[] arrWithoutDuplicates = removeDuplicateElementsInArrEx.getArrayWithoutDuplicatesByHashSet(numbers);
    System.out.println("Array without duplicates");
    for (int num : arrWithoutDuplicates) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public Integer[] getArrayWithoutDuplicatesByForLoop(Integer numbers[]) {
    String nonDuplicateElements = "";
    int noOfDuplicateElements = 0;

    for (int lp1 = 0; lp1 < numbers.length; lp1++) {
      if (nonDuplicateElements.indexOf(String.valueOf(numbers[lp1])) == -1) {
        nonDuplicateElements = nonDuplicateElements.concat(numbers[lp1] + ",");
      } else {
        continue;
      }
      for (int lp2 = (lp1 + 1); lp2 < numbers.length; lp2++) {
        if (numbers[lp1] == numbers[lp2]) {
          noOfDuplicateElements++;
        }
      }
    }

    Integer[] arrWithoutDuplicates = new Integer[numbers.length - noOfDuplicateElements];
    String[] arrWithoutDupl = nonDuplicateElements.split(",");
    for (int lp1 = 0; lp1 < arrWithoutDupl.length; lp1++) {
      arrWithoutDuplicates[lp1] = Integer.parseInt(arrWithoutDupl[lp1]);
    }
    return arrWithoutDuplicates;
  }

  public Integer[] getArrayWithoutDuplicatesByHashSet(Integer numbers[]) {
    Set<Integer> hs = new LinkedHashSet<>();

    for (int lp1 = 0; lp1 < numbers.length; lp1++) {
      hs.add(numbers[lp1]);
    }

    Integer[] arrWithoutDuplicates = new Integer[hs.size()];
    arrWithoutDuplicates = hs.toArray(arrWithoutDuplicates);

    return arrWithoutDuplicates;
  }
}

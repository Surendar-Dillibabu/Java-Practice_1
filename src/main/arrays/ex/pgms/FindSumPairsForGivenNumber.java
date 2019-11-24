package main.arrays.ex.pgms;

import java.util.Arrays;

public class FindSumPairsForGivenNumber {

  public static void main(String[] args) {
    FindSumPairsForGivenNumber obj = new FindSumPairsForGivenNumber();
    int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
    int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
    System.out.println("Given array :" + Arrays.toString(numbers));
    System.out.println("Sum of number :7");
    System.out.println("Pairs of numbers which forms 7");
    obj.printPairs(numbers, 7);
    System.out.println("Given array :" + Arrays.toString(numbersWithDuplicates));
    System.out.println("Sum of number :7");
    System.out.println("Pairs of numbers which forms 7");
    obj.printPairs(numbersWithDuplicates, 7);
  }

  public void printPairs(int[] numArr, int sum) {
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if ((numArr[lp1] + numArr[lp2]) == sum) {
          System.out.printf("(%d, %d) %n", numArr[lp1], numArr[lp2]);
        }
      }
    }
  }
}

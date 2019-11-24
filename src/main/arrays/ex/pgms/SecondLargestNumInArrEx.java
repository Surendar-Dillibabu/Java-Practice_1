package main.arrays.ex.pgms;

import java.util.Arrays;

public class SecondLargestNumInArrEx {

  public static void main(String[] args) {
    SecondLargestNumInArrEx secondLargestNumInArrEx = new SecondLargestNumInArrEx();
    int numbers[] = new int[] { 1, 15, 7, 15, 12, 3 };
    // int secLargestNum =
    // secondLargestNumInArrEx.findSecondLargestNumInArrUsingSorting(numbers);
    int secLargestNum = secondLargestNumInArrEx.findSecondLargestNumInArr(numbers);
    System.out.println("Second largest element is :" + secLargestNum);
  }

  public int findSecondLargestNumInArrUsingSorting(int[] numbers) {

    System.out.println("Before sorting the elements");
    Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
    System.out.println();

    int temp = 0;
    for (int lp1 = 0; lp1 < numbers.length; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < numbers.length; lp2++) {
        if (numbers[lp2] > numbers[lp1]) {
          temp = numbers[lp1];
          numbers[lp1] = numbers[lp2];
          numbers[lp2] = temp;
        }
      }
    }

    System.out.println("After sorting the elements");
    Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
    System.out.println();

    return numbers[1];
  }

  public int findSecondLargestNumInArr(int[] numbers) {
    int first, second;
    first = second = numbers[0];
    for (int lp1 = 1; lp1 < numbers.length; lp1++) {
      if (numbers[lp1] > first) {
        second = first;
        first = numbers[lp1];
      } else if (numbers[lp1] > second && numbers[lp1] != first) {
        second = numbers[lp1];
      }
    }

    return second;
  }
}

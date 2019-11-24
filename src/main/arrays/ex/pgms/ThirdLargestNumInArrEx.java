package main.arrays.ex.pgms;

import java.util.Arrays;

public class ThirdLargestNumInArrEx {

  public static void main(String[] args) {
    ThirdLargestNumInArrEx thirdLargestNumInArrEx = new ThirdLargestNumInArrEx();
    int numbers[] = new int[] { 1, 15, 7, 6, 12, 3 };
    // int thirdLargestNum =
    // thirdLargestNumInArrEx.findThirdLargestNumInArrUsingSorting(numbers);
    int thirdLargestNum = thirdLargestNumInArrEx.findThirdLargestNumInArr(numbers);
    System.out.println("Third largest element is :" + thirdLargestNum);
  }

  public int findThirdLargestNumInArrUsingSorting(int[] numbers) {

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

    return numbers[2];
  }

  public int findThirdLargestNumInArr(int[] numbers) {
    int first, second, third;
    first = second = third = numbers[0];
    for (int lp1 = 1; lp1 < numbers.length; lp1++) {
      if (numbers[lp1] > first) {
        third = second;
        second = first;
        first = numbers[lp1];
      } else if (numbers[lp1] > second && numbers[lp1] != first) {
        third = second;
        second = numbers[lp1];
      }
    }

    return third;
  }
}

package main.arrays.ex.pgms;

public class LeftRotateArrayEx {

  public static void main(String args[]) {
    int numbers[] = new int[] { 5, 7, 8, 2, 3 };
    System.out.println("Before rotating the elements");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
    System.out.println();
    for (int lp1 = 0; lp1 < numbers.length-1; lp1++) {
      int first = numbers[0];
      for (int lp2 = 1; lp2 < numbers.length; lp2++) {
        numbers[lp2 - 1] = numbers[lp2];
      }
      numbers[numbers.length - 1] = first;
    }

    System.out.println("After rotating the elements");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
  }
}

package main.arrays.ex.pgms;

public class RightRotateArrayEx {

  public static void main(String args[]) {
    int numbers[] = new int[] { 5, 7, 8, 2, 3 };
    System.out.println("Before rotating the elements");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
    System.out.println();
    int arrLen = numbers.length;
    for (int lp1 = 0; lp1 < arrLen - 1; lp1++) {
      int last = numbers[arrLen - 1];
      for (int lp2 = arrLen - 1; lp2 > 0; lp2--) {
        numbers[lp2] = numbers[lp2 - 1];
      }
      numbers[0] = last;
    }
    System.out.println("After rotating the elements");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
  }
}

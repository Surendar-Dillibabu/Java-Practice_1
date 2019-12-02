package main.sorting.ex.pgms;

public class MergeTwoSortedArrays {

  public static void main(String[] args) {
    MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
    int[] numArr1 = { 1, 3, 5, 7 };
    int n1 = numArr1.length;

    int[] numArr2 = { 2, 4, 6, 8 };
    int n2 = numArr2.length;

    int[] numArr3 = new int[n1 + n2];

    obj.mergeArrays(numArr1, numArr2, n1, n2, numArr3);

    System.out.println("Merged array values :");
    obj.printArray(numArr3);
  }

  public void printArray(int[] numArr) {
    for (int num : numArr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public void mergeArrays(int[] numArr1, int[] numArr2, int n1, int n2, int[] numArr3) {

    int i = 0, j = 0, k = 0;

    while (i < n1 && j < n2) {

      if (numArr1[i] < numArr2[j]) {
        numArr3[k++] = numArr1[i++];
      } else {
        numArr3[k++] = numArr2[j++];
      }
    }

    while (i < n1)
      numArr3[k++] = numArr1[i++];

    while (j < n2)
      numArr3[k++] = numArr2[j++];
  }
}

package main.sorting.ex.pgms;

public class MergeSortDemo {

  public static void main(String[] args) {
    MergeSortDemo mergeSortDemo = new MergeSortDemo();
    // int[] numArr = { 10, 80, 30, 90, 40, 50, 70 };
    // int[] numArr = { 10, 8, 7, 5, 10, 7, 15, 28, 8 };
    int[] numArr = { 6, 5, 3, 1, 8, 7, 2, 4 };
    System.out.println("Before sorting the array :");
    mergeSortDemo.printArray(numArr);

    mergeSortDemo.mergeSort(numArr, 0, (numArr.length - 1));

    System.out.println("After sorting the array :");
    mergeSortDemo.printArray(numArr);
  }

  public void printArray(int[] numArr) {
    for (int num : numArr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public void mergeSort(int[] numArr, int left, int right) {
    if (left < right) {
      int mid = left + (right - left) / 2;

      mergeSort(numArr, left, mid);

      mergeSort(numArr, (mid + 1), right);

      sort(numArr, left, mid, right);
    }
  }

  public void sort(int[] numArr, int left, int mid, int right) {
    int n1 = (mid - left) + 1;
    int n2 = right - mid;

    int[] leftArr = new int[n1];
    int[] rightArr = new int[n2];

    for (int lp1 = 0; lp1 < n1; lp1++)
      leftArr[lp1] = numArr[left + lp1];

    for (int lp2 = 0; lp2 < n2; lp2++)
      rightArr[lp2] = numArr[(mid + lp2 + 1)];

    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
      if (leftArr[i] > rightArr[j]) {
        numArr[k] = rightArr[j];
        j++;
      } else {
        numArr[k] = leftArr[i];
        i++;
      }
      k++;
    }

    while (i < n1) {
      numArr[k] = leftArr[i];
      i++;
      k++;
    }

    while (j < n2) {
      numArr[k] = rightArr[j];
      j++;
      k++;
    }
  }
}

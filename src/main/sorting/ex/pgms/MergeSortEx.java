package main.sorting.ex.pgms;

public class MergeSortEx {

  public static void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] leftArr = new int[n1];
    int[] rightArr = new int[n2];

    for (int lp1 = 0; lp1 < n1; lp1++)
      leftArr[lp1] = arr[left + lp1];

    for (int lp2 = 0; lp2 < n2; lp2++)
      rightArr[lp2] = arr[(mid + lp2 + 1)];

    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
      if (leftArr[i] <= rightArr[j]) {
        arr[k] = leftArr[i];
        i++;
      } else {
        arr[k] = rightArr[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = leftArr[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = rightArr[j];
      j++;
      k++;
    }
  }

  public static void sort(int[] arr, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;

      sort(arr, left, mid); // left side half

      sort(arr, (mid + 1), right); // right side half

      merge(arr, left, mid, right);
    }
  }

  public static void printArray(int[] numArr) {
    System.out.println("Elements present in the array :");
    for (int num : numArr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] numArr = { 38, 27, 43, 3, 9, 82, 10 };

    System.out.println("Before sorting the array using merge sort");
    printArray(numArr);

    sort(numArr, 0, numArr.length - 1);

    System.out.println("After sorting the array using merge sort");
    printArray(numArr);
  }
}

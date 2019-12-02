package main.interview.pgms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindKthSmallestInteger {

  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("Please enter the length of array :");
      int arrLength = Integer.parseInt(br.readLine());
      int[] numArr = new int[arrLength];
      for (int lp1 = 0; lp1 < arrLength; lp1++) {
        System.out.println("Please enter the element value of index " + lp1);
        numArr[lp1] = Integer.parseInt(br.readLine());
      }

      System.out.println("Please enter the kth element to find the smallest integer");
      int kthNum = Integer.parseInt(br.readLine());

      FindKthSmallestInteger obj = new FindKthSmallestInteger();
      System.out.println("Before sorting the array :");
      obj.printArray(numArr);

      QuickSort quickSortObj = obj.new QuickSort();
      quickSortObj.quickSort(numArr, 0, (arrLength - 1));

      System.out.println("After sorting the array :");
      obj.printArray(numArr);

      System.out.println("Smallest integer of kth is :" + (numArr[(kthNum - 1)]));
    }
  }

  public void printArray(int[] numArr) {
    for (int num : numArr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  private class QuickSort {

    public void quickSort(int[] numArr, int low, int high) {
      int pivot = numArr[(low + (high - low) / 2)];
      int i = low;
      int j = high;

      while (i <= j) {
        while (numArr[i] < pivot) {
          i++;
        }

        while (numArr[j] > pivot) {
          j--;
        }

        if (i <= j) {
          swap(numArr, i, j);
          i++;
          j--;
        }
      }

      if (i < high) {
        quickSort(numArr, i, high);
      }

      if (low < j) {
        quickSort(numArr, low, j);
      }

    }

    public void swap(int[] numArr, int i, int j) {
      int temp = numArr[j];
      numArr[j] = numArr[i];
      numArr[i] = temp;
    }
  }
}

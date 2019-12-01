package main.sorting.ex.pgms;

public class QuickSortDemo {

  private class QuickSort {

    public int sort(int[] numArr, int low, int high, int loopCount) {
      int pivot = numArr[low + (high - low) / 2];
      int i = low;
      int j = high;

      while (i <= j) {
        loopCount++;
        while (numArr[i] < pivot) {
          i++;
          loopCount++;
        }

        while (numArr[j] > pivot) {
          j--;
          loopCount++;
        }

        if (i <= j) {
          swap(numArr, i, j);
          i++;
          j--;
        }
      }

      if (i < high) {
        loopCount = sort(numArr, i, high, loopCount);
      }

      if (low < j) {
        loopCount = sort(numArr, low, j, loopCount);
      }

      return loopCount;
    }

    public void swap(int[] numArr, int i, int j) {
      int temp = numArr[j];
      numArr[j] = numArr[i];
      numArr[i] = temp;
    }
  }

  public static void main(String[] args) {
    // int[] numArr = { 10, 80, 30, 90, 40, 50, 70 };
    int[] numArr = { 6, 5, 3, 1, 8, 7, 2, 4 };
    int loopCount = 0;
    QuickSortDemo quickSortDemo = new QuickSortDemo();

    System.out.println("Before sorting the array :");
    quickSortDemo.printArray(numArr);

    QuickSortDemo.QuickSort quickSort = quickSortDemo.new QuickSort();
    loopCount = quickSort.sort(numArr, 0, (numArr.length - 1), loopCount);
    System.out.println("loopCount :" + loopCount);

    System.out.println("After sorting the array :");
    quickSortDemo.printArray(numArr);
  }

  public void printArray(int[] numArr) {
    for (int num : numArr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}

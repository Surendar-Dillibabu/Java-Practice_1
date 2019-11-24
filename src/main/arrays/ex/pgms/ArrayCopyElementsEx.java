package main.arrays.ex.pgms;

import java.util.Arrays;

public class ArrayCopyElementsEx {

  public static final void main(String args[]) {
    ArrayCopyElementsEx arrayCopyElementsEx = new ArrayCopyElementsEx();
    int numArr[] = new int[] { 3, 60, 35, 2, 45, 320, 5 };
    // int newArr[] = arrayCopyElementsEx.copyElementsByIteration(numArr);
    // int newArr[] = arrayCopyElementsEx.copyElementsByArraysClass(numArr);
    // int newArr[] = arrayCopyElementsEx.copyElementsByUsingClone(numArr);
    int newArr[] = arrayCopyElementsEx.copyElementsByUsingArrayCopy(numArr);
    for (int num : newArr) {
      System.out.println(num);
    }
  }

  public int[] copyElementsByIteration(final int numArr[]) {
    int newArr[] = new int[numArr.length];
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      newArr[lp1] = numArr[lp1];
    }
    return newArr;
  }

  public int[] copyElementsByArraysClass(final int numArr[]) {
    return Arrays.copyOf(numArr, numArr.length);
  }

  public int[] copyElementsByUsingClone(final int numArr[]) {
    int newArr[] = new int[numArr.length];
    newArr = numArr.clone();
    return newArr;
  }

  public int[] copyElementsByUsingArrayCopy(final int numArr[]) {
    int newArr[] = new int[numArr.length];
    System.arraycopy(numArr, 0, newArr, 0, numArr.length);
    return newArr;
  }
}

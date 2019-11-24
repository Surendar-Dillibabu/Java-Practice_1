package main.arrays.ex.pgms;

import java.util.Arrays;

public class SortUsingArraysCls {

  public static void main(String[] args) {
    int[] numArr = { 5, 3, 10, 60, 47, 25 };

    System.out.println("Array primitive elements before sorting :");
    for (int n : numArr) {
      System.out.print(n + " ");
    }
    System.out.println("");

    // Arrays class sort method to sort primitive elements
    Arrays.sort(numArr);

    System.out.println("Array primitive elements after sorting :");
    for (int n : numArr) {
      System.out.print(n + " ");
    }
    System.out.println("");

    String[] alphabetsArr = { "Z", "E", "C", "U", "X", "A", "V", "J", "N", "W" };

    System.out.println("Array object elements before sorting :");
    for (String str : alphabetsArr) {
      System.out.print(str + " ");
    }
    System.out.println("");

    // Arrays class sort method to sort object elements. Natural sorting order
    Arrays.sort(alphabetsArr);

    System.out.println("Array object elements after sorting :");
    for (String str : alphabetsArr) {
      System.out.print(str + " ");
    }
    System.out.println("");

    String[] alphabetsArr1 = { "Z", "E", "C", "U", "X", "A", "V", "J", "N", "W" };

    // Arrays class sort method to sort object elements. Customized sorting order
    // using comparator interface
    Arrays.sort(alphabetsArr1, new DescendingComparator());

    System.out.println("Array object elements after sorting using customized sorting order :");
    for (String str : alphabetsArr1) {
      System.out.print(str + " ");
    }
    System.out.println("");

  }
}

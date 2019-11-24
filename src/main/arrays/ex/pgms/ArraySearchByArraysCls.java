package main.arrays.ex.pgms;

import static java.util.Arrays.binarySearch; // Used particular static method import
import java.util.Arrays;

public class ArraySearchByArraysCls {

  public static void main(String[] args) {
    int[] numArr = { 5, 3, 10, 60, 47, 25 };

    System.out.println("Primitive elements present in the array before sorting & searching :");
    for (int n : numArr) {
      System.out.print(n + " ");
    }
    System.out.println("");

    // Applying natural sorting order before searching in the binary search
    Arrays.sort(numArr);

    System.out.println("Primitive elements present in the array after sorting & searching :");
    for (int n : numArr) {
      System.out.print(n + " ");
    }
    System.out.println("");

    System.out.println("Primitive element 25 present in the index :" + binarySearch(numArr, 25));

    String[] alphabetsArr = { "Z", "E", "C", "U", "X", "A", "V", "J", "N", "W" };

    System.out.println("Object elements present in the array before sorting & searching :");
    for (String str : alphabetsArr) {
      System.out.print(str + " ");
    }
    System.out.println("");

    // Arrays class sort method to sort object elements. Natural sorting order
    Arrays.sort(alphabetsArr);

    System.out.println("Object elements present in the array after sorting :");
    for (String str : alphabetsArr) {
      System.out.print(str + " ");
    }
    System.out.println("");

    System.out.println("Object element U present in the index :" + binarySearch(alphabetsArr, "U"));

    String[] alphabetsArr1 = { "Z", "E", "C", "U", "X", "A", "V", "J", "N", "W" };

    // Arrays class sort method to sort object elements. Customized sorting order
    // using comparator interface
    Arrays.sort(alphabetsArr1, new DescendingComparator());

    System.out.println("Array object elements after sorting using customized sorting order :");
    for (String str : alphabetsArr1) {
      System.out.print(str + " ");
    }
    System.out.println("");

    System.out
        .println("Element U present in the index :" + binarySearch(alphabetsArr1, "U", new DescendingComparator()));

  }
}

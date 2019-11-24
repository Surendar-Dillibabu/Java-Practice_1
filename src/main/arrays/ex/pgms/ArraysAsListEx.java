package main.arrays.ex.pgms;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {

  public static void main(String[] args) {
    Integer[] numArr = { 5, 3, 10, 60, 47, 25 };

    List<Integer> ls = Arrays.asList(numArr);

    System.out.println("Elements present in the list :" + ls);

    // Here we can't perform any add or remove operation. Because internally array
    // reference only we are pointing to ArrayList
    // If we try to add or remove elements which changes the internal array size
    // then it will throw UnsupportedOperationException
    // ls.add(30);
    // ls.remove(2);

    // But we can set the element. Set is nothing but replace. So, it will work
    ls.set(2, 30);
    System.out.println("Elements present in the list :" + ls);
  }
}

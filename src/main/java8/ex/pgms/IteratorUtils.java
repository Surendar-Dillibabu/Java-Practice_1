package main.java8.ex.pgms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;

// Program to get an Iterator over a primitive array in Java 8
class IteratorUtils {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };

    // 1. PrimitiveIterator.OfInt - Arrays.stream() + iterator()
    PrimitiveIterator.OfInt primitiveIterator = Arrays.stream(arr).iterator();
    if (primitiveIterator.hasNext())
      System.out.println(primitiveIterator.nextInt());

    // 2. Arrays.stream() + boxed() + iterator()
    Iterator<Integer> iterator = Arrays.stream(arr).boxed().iterator();
    if (iterator.hasNext())
      System.out.println(iterator.next());

    // 3. Arrays.stream() + mapToObj() + iterator()
    Iterator<Integer> itr = Arrays.stream(arr).mapToObj(Integer::valueOf).iterator();
    if (itr.hasNext())
      System.out.println(itr.next());

  }
}
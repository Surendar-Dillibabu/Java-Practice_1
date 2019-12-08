package main.java8.ex.pgms;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

// Program to get an Iterator over a primitive array in Java 8
class IteratorUtils1 {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };

    // 1. PrimitiveIterator.OfInt - IntStream.of() + iterator()
    PrimitiveIterator.OfInt primitiveIterator = IntStream.of(arr).iterator();
    if (primitiveIterator.hasNext())
      System.out.println(primitiveIterator.nextInt());

    // 2. IntStream.of() + boxed() + iterator()
    Iterator<Integer> iterator = IntStream.of(arr).boxed().iterator();
    if (iterator.hasNext())
      System.out.println(iterator.next());

    // 3. IntStream.of() + mapToObj() + iterator()
    Iterator<Integer> itr = IntStream.of(arr).mapToObj(Integer::valueOf).iterator();
    if (itr.hasNext())
      System.out.println(itr.next());

    System.out.println(Integer.MAX_VALUE);
  }
}
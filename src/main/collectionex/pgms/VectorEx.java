package main.collectionex.pgms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) {
    // Default capacity as 10 and increment by 2 elements when adding 11 the element
    // the size will become 12.
    // When adding 13th element the size will become 14 and so on
    Vector<Integer> v = new Vector<>(10, 2);
    v.add(10);
    v.add(30);
    v.add(20);
    v.add(80);
    v.add(60);
    v.add(50);
    v.add(50);
    v.add(50);
    v.add(50);
    v.add(50);
    v.add(50);

    System.out.println("Elements present in the vector :" + v);

    System.out.println("Iterating vector elements using for-each loop");
    for (Integer num : v) {
      System.out.print(num + " ");
    }
    System.out.println();

    System.out.println("Iterating vector elements using enumeration");
    Enumeration<Integer> enumerationObj = v.elements();
    while (enumerationObj.hasMoreElements()) {
      System.out.print(enumerationObj.nextElement() + " ");
    }
    System.out.println();

    System.out.println("Iterating vector elements using iterator");
    Iterator<Integer> it = v.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
    System.out.println();

    System.out.println("Iterating vector elements using listiterator");
    ListIterator<Integer> lit = v.listIterator();
    while (lit.hasNext()) {
      System.out.print(lit.next() + " ");
    }
    System.out.println();

  }
}

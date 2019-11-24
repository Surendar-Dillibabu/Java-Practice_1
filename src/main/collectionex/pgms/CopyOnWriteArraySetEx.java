package main.collectionex.pgms;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * CopyOnWriteArraySet internally uses CopyOnWriteArrayList. It won't allow
 * duplicates because in add method CopyOnWriteArraySet it will call addIfAbsent
 * method to add element so it won't allow duplicates Other cases it will behave
 * as like CopyOnWriteArrayList
 * 
 * @author Surendar
 *
 */
public class CopyOnWriteArraySetEx {

  public static void main(String[] args) {
    CopyOnWriteArraySet<Integer> cs = new CopyOnWriteArraySet<>();
    cs.add(10);
    cs.add(15);
    cs.add(8);
    cs.add(5);
    cs.add(60);
    cs.add(8);
    cs.add(25);

    System.out.println("Iterating elements using for-each loop");
    for (Integer num : cs) {
      if (num == 60) {
        // Here it will add the element by creating new array of elements and then
        // re-assign the array to this array
        // So, it won't print the newly added elements
        cs.add(35);
      }
      System.out.println(num);
    }
    System.out.println(cs);

    System.out.println("Iterating elements using iterator");
    Iterator<Integer> it = cs.iterator();
    while (it.hasNext()) {
      Integer num = it.next();
      if (num == 60) {
        // Here it will add the element by creating new array of elements and then
        // re-assign the array to this array
        // So, it won't print the newly added elements
        cs.add(80);
      }
      if (num == 35) {
        // This below line will throw UnsupportedException since it is a cloned or copy
        // of array we are iterating
        // it.remove();
      }
      System.out.println(num);
    }

    System.out.println("Final list elements :" + cs);
  }
}

package main.collectionex.pgms;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList is not feasible for multi threaded environment. So, all collections
 * apart from Vector, Stack, HashTable are not thread safe. So, to prevent
 * modification it won't allow even in single thread environment to add or
 * remove the element.
 * 
 * @author Surendar
 *
 */
public class ConcurrentModificationExceptionEx {

  public static void main(String[] args) {
    ArrayList<Integer> ls = new ArrayList<>();
    ls.add(10);
    ls.add(36);
    ls.add(87);
    ls.add(80);
    ls.add(25);
    ls.add(18);

    System.out.println("Iterating elements present in the list using for-each loop :");
    for (Integer n : ls) {
      System.out.println(n);
      if (n == 36) {
        // ls.add(56); // In this line it will throw ConcurrentModificationException
      }
      if (n == 10) {
        // ls.remove(2); // In this line it will throw ConcurrentModificationException
      }
      if (n == 10) {
        ls.set(3, 58); // This is allowed. Since we are not doing any structural modification. We are
                       // only replacing the existing enty
      }
    }

    System.out.println("Iterating elements present in the list using iterator :");
    Iterator<Integer> it = ls.iterator();
    while (it.hasNext()) {
      int n = it.next();
      if (n == 10) {
        it.remove();
      } else {
        System.out.println(n);
      }
    }
  }
}

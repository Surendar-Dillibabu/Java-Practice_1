package main.collectionex.pgms;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

  public static void main(String[] args) {
    CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
    al.add(10);
    al.add(15);
    al.add(8);
    al.add(5);
    al.add(60);
    al.add(25);

    System.out.println("Iterating elements using for-each loop");
    for (Integer num : al) {
      if (num == 60) {
        // Here it will add the element by creating new array of elements and then re-assign the array to this array
        // So, it won't print the newly added elements
        al.add(35);
      }
      System.out.println(num);
    }
    System.out.println(al);

    System.out.println("Iterating elements using iterator");
    Iterator<Integer> it = al.iterator();
    while (it.hasNext()) {
      Integer num = it.next();
      if (num == 60) {
        // Here it will add the element by creating new array of elements and then re-assign the array to this array
        // So, it won't print the newly added elements
        al.add(80); 
      }
      if (num == 35) {
        // This below line will throw UnsupportedException since it is a cloned or copy of array we are iterating
        // it.remove();
      }
      System.out.println(num);
    }
    
    System.out.println("Final list elements :"+al);
  }
}

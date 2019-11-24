package main.collectionex.pgms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ArrayList extends AbstractList class and implements List, RandomAccess,
 * Clonable and Serializable interfaces Internally ArrayList is stored as a
 * Array of objects. So, we can access the elements like array by index as fast
 * ArrayList implements RandomAccess interface to indicate that it support for
 * random access with constant time o(1) retrieval always (Ex : ls.get(index))
 * => Internally stores as an array so it will access the element through index
 * elementData[index] and returns the elements fastly So, if we have a
 * requirement of frequent searching of elements than ArrayList is best choice.
 * Since it maintains fast and constant retrieval. In case of Insertion/Removal
 * operation ArrayList is not good. Since whenever the default capacity (10)
 * exceeds it has to create new array of objects with new capacity and then has
 * to copy the elements.
 * 
 * @author Surendar
 *
 */
public class ArrayListStoringLogic {

  public static void main(String[] args) {
    /*
     * Types of ArrayList creation ArrayList<String> ls = new ArrayList<>();
     * ArrayList<String> ls = new ArrayList<>(int initialCapacity);
     * ArrayList<String> ls = new ArrayList<>(Collection c);
     */
    ArrayList<String> ls = new ArrayList<>(); // Default capacity is {}
    ls.add("aaa"); // capacity is 10
    ls.add("bbb");
    ls.add("aaa");
    ls.add("ccc");
    ls.add("ccc");
    ls.add("ds");
    ls.add("cdc");
    ls.add("ccdfgc");
    ls.add("cccsdf");
    ls.add("csdc");
    // capacity is 16. While adding 11th element it will increase the capacity (i.e.
    // newCapacity = oldCapacity + (oldCapacity >> 1))
    // newCapacity = 10 + (10 >> 1) = 10 + (1010 >> 1) = 10 + (0101) = 10 + 6 = 16
    ls.add("csdce");
    System.out.println(ls.get(1));
    System.out.println("Array list elements :" + ls);

    System.out.println("Forward iteration :");
    ListIterator<String> forwardIter = ls.listIterator();
    while (forwardIter.hasNext()) {
      System.out.println(forwardIter.next());
    }

    System.out.println("Backward iteration :");
    ListIterator<String> itr = ls.listIterator(ls.size());
    while (itr.hasPrevious()) {
      System.out.println(itr.previous());
    }

    // The below will return a SubList class object present inside ArrayList which
    // contains the elements inside the index element
    List<String> sList = ls.subList(3, 7);

    System.out.println("Iterate using sub list iterator :");
    // The below will return the SubList class iterator interface object
    Iterator<String> sListIter = sList.iterator();
    while (sListIter.hasNext()) {
      System.out.println(sListIter.next());
    }
  }

}

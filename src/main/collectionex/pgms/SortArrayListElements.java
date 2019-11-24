package main.collectionex.pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListElements {

  class AlphabetsComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      return o2.compareTo(o1);
    }

  }

  public static void main(String[] args) {
    ArrayList<String> ls = new ArrayList<>();
    ls.add("Z");
    ls.add("E");
    ls.add("C");
    ls.add("U");
    ls.add("X");
    ls.add("A");
    ls.add("V");
    ls.add("J");
    ls.add("N");
    ls.add("W");

    // Heterogenous object. In this case if we call Collections.sort it will throw
    // ClassCastException.
    // Since Collections.sort will follow default sorting using Comparables since we
    // are not passing any customized comparable or comparator object
    // Then while comparing it will throw ClassCastException since it has to compare
    // the values for sorting.
    // ls.add(10);

    // Adding null values will throw NullPointerException while calling
    // Collections.sort method.
    // Since Null values can't be compared with other element values. It will throw
    // NullPointerException
    // ls.add(null);

    System.out.println("Arraylist elements without sorting :" + ls);

    Collections.sort(ls); // Natural sorting order

    System.out.println("Arraylist elements after sorting :" + ls);

    Collections.reverse(ls); // Reversing the list

    // After applying natural sorting order and then if we apply reverse method it
    // will reverse the values and then we can get the descending order
    System.out.println("Reversed list elements :" + ls);

    ArrayList<String> ls1 = new ArrayList<>();
    ls1.add("Z");
    ls1.add("E");
    ls1.add("C");
    ls1.add("U");
    ls1.add("X");
    ls1.add("A");
    ls1.add("V");
    ls1.add("J");
    ls1.add("N");
    ls1.add("W");

    System.out.println("New Arraylist elements without sorting :" + ls1);

    Collections.sort(ls1, new SortArrayListElements().new AlphabetsComparator()); // Customized sorting using comparator

    System.out.println("Arraylist elements after applying customized sorting :" + ls1);
  }
}

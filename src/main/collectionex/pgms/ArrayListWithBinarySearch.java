package main.collectionex.pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListWithBinarySearch {

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

    System.out.println("Elements present in the ArrayList :" + ls);

    // Unpredictable or undefined results since binary search method follows binary
    // search algorithm internally
    // So, the corresponding objects or lists must be sorted before calling the
    // binary search method
    System.out.println(Collections.binarySearch(ls, "A"));

    Collections.sort(ls); // Sorted using natural sorting order

    // Now the list is sorted so, for A it will give the index position as 0 since
    // as per natural sorted order A will be in first index
    System.out.println(Collections.binarySearch(ls, "A")); // 0

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

    // Before calling binary search with comparator we have to sort the elements
    // with the corresponding comparator which we are going to pass to the binary
    // search method
    Collections.sort(ls1, new ArrayListWithBinarySearch().new AlphabetsComparator());

    // Now we are passing our customized comparator interface because to find the
    // corresponding value it has to find the mid elements and compare the value
    // based on the tree with the comparator which we used to sort the elements
    int indexPos = Collections.binarySearch(ls1, "A", new ArrayListWithBinarySearch().new AlphabetsComparator());
    System.out.println("Arraylist elements after applying customized sorting :" + indexPos);

  }
}

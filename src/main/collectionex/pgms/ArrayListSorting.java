package main.collectionex.pgms;

import java.util.ArrayList;

public class ArrayListSorting {

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
    al.add(5);
    al.add(18);
    al.add(1);
    al.add(8);
    al.add(62);
    al.add(25);
    al.add(36);

    System.out.println("Before sorting elements present in the ArrayList :" + al);
    al.sort(new DescendingComparator());

    System.out.println("After sorting elements present in the ArrayList :" + al);
  }
}

package main.collectionex.pgms;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDescOrderUsingComparator {

  class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      System.out.println("o1 :"+o1+" o2 :"+o2);
      return (o1 == o2) ? 0 : (o1 < o2 ? 1 : -1);
    }

  }

  public static void main(String[] args) {
    Set<Integer> ts = new TreeSet<>(new TreeSetDescOrderUsingComparator().new MyComparator());
    ts.add(10);
    ts.add(0);
    ts.add(5);
    ts.add(12);
    ts.add(2);
    ts.add(20);
    System.out.println(ts);
  }
}

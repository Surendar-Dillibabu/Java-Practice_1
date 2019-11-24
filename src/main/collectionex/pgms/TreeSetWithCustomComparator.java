package main.collectionex.pgms;

import java.util.Set;
import java.util.TreeSet;

/**
 * StringBuffer is not implemented Comparable interface. So if we try to insert StringBuffer in TreeSet then we will get 
 * "Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable" error
 *  since TreeSet will use comparable as default if we don't provide our own Comparator object for comparing the values then it will try to cast the value as Comparable which is natural one selected by TreeSet
 *  Then we will get ClassCastException while casting from StringBuffer to Comparable 
 * @author Surendar
 *
 */
public class TreeSetWithCustomComparator {

  public static void main(String[] args) {
    Set<StringBuffer> ts = new TreeSet<>();
    ts.add(new StringBuffer("a"));
    ts.add(new StringBuffer("A"));
    ts.add(new StringBuffer("z"));
    ts.add(new StringBuffer("L"));
    ts.add(new StringBuffer("Z"));
    System.out.println(ts);
  }
}

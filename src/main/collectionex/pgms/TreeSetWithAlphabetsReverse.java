package main.collectionex.pgms;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithAlphabetsReverse {

  class AlphabetsReverseComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      int o1_len = o1.length();
      int o2_len = o2.length();
      int minLen = Math.min(o1_len, o2_len);
      char c1[] = o1.toCharArray();
      char c2[] = o2.toCharArray();

      for (int lp1 = 0; lp1 < minLen; lp1++) {
        if (c1[lp1] != c2[lp1]) {
          return c2[lp1] - c1[lp1];
        }
      }
      return o2_len - o1_len;
    }
  }

  public static void main(String[] args) {
    Set<String> ts = new TreeSet<>(new TreeSetWithAlphabetsReverse().new AlphabetsReverseComparator());

    ts.add("Raja");
    ts.add("Shobarani");
    ts.add("Rajakumari");
    ts.add("Gangabhavani");
    ts.add("Ramulamma");

    System.out.println(ts);
  }
}

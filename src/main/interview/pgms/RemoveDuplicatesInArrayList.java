package main.interview.pgms;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicatesInArrayList {

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
    al.add(5);
    al.add(18);
    al.add(10);
    al.add(8);
    al.add(62);
    al.add(5);
    al.add(10);
    al.add(36);

    System.out.println("Before removing duplicates :" + al);

    if (al != null && !al.isEmpty()) {
      int curSize = al.size();
      int lp1 = 0;
      while ((curSize - 1) > lp1) {
        Iterator<Integer> it = al.listIterator((lp1 + 1));
        while (it.hasNext()) {
          Integer curNum = it.next();
          if (al.get(lp1).equals(curNum)) {
            it.remove();
          }
        }
        lp1++;
        curSize = al.size();
      }
    }

    System.out.println("After removing duplicates :" + al);
  }
}

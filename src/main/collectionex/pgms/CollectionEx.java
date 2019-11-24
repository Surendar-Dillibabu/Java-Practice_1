package main.collectionex.pgms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class CollectionEx {

  public static void main(String[] args) {
    System.out.println("FB".hashCode());
    System.out.println("Ea".hashCode());
    Map<String, String> hm = new HashMap<>();
    System.out.println(hm.put("aa", "TestingItem"));
    System.out.println(hm.put("aa", "te"));
    System.out.println(hm.put("FB", "Test"));
    System.out.println(hm.put("Ea", "Testing"));
    System.out.println(hm);
    Set<Integer> hs = new HashSet<>();
    hs.add(10);
    hs.add(50);
    hs.add(60);
    Set<Integer> lhs = new LinkedHashSet<>();
    lhs.add(10);
    lhs.add(50);
    lhs.add(60);
    LinkedList<Integer> l = new LinkedList<>();
    l.add(10);
    l.add(40);
    l.add(20);
    l.add(50);
    l.add(28);
    // System.out.println(l);
    // l.push(87);
    System.out.println(l);
    l.pop();
    System.out.println(l);

    /*
     * int oldCapacity = 10; System.out.println((oldCapacity >> 1)); int x = -4;
     * System.out.println(Integer.toBinaryString(x)); x = (x >> 1);
     * System.out.println(x); System.out.println(Integer.toBinaryString(x)); int y =
     * 4; System.out.println(Integer.toBinaryString(y)); y = (y >> 1);
     * System.out.println(y); System.out.println(Integer.toBinaryString(y));
     */
  }
}

package main.collectionex.pgms;

import java.util.TreeMap;

public class NavigatableMapEx {

  public static void main(String[] args) {
    TreeMap<String, Integer> hm = new TreeMap<>();
    hm.put("dsa", 58);
    hm.put("ser", 10);
    hm.put("ccc", 57);
    hm.put("aaa", 78);
    hm.put("dwd", 54);
    hm.put("hr", 76);
    hm.put("ur", 17);
    hm.put("zw", 75);
    hm.put("ht", 97);
    hm.put("wq", 45);

    System.out.println("Elements present in the TreeMap :" + hm);
    System.out.println("First element :" + hm.firstKey());
    System.out.println("Last element :" + hm.lastKey());

    // Returns first element lesser than or equal to 50. (i.e.) <= 50
    System.out.println(hm.floorKey("ht"));

    // Returns first element before 50. (i.e.) < 50
    System.out.println(hm.lowerKey("ht"));

    // Returns first element greater than or equal to 50. (i.e.) >= 50
    System.out.println(hm.ceilingKey("ht"));

    // Returns first element after 50. (i.e.) > 50
    System.out.println(hm.higherKey("ht"));

    System.out.println("Elements present in the TreeSet with descending order :" + hm.descendingMap());

    // Retrives and removes the first entry from the bucket. If not present returns
    // null
    System.out.println(hm.pollFirstEntry());

    // Retrives and removes the last entry from the bucket. If not present returns
    // null
    System.out.println(hm.pollLastEntry());

    System.out.println("Elements present in the TreeMap after polling :" + hm);

  }
}

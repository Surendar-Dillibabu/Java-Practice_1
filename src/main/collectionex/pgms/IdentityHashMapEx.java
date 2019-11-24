package main.collectionex.pgms;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Identity hash map is similar to HashMap but instead of equals and hashCode comparsion it will use == and System.identityHashCode comparsion.
 * equals method is costly operation in terms of content comparsion but == operator is not costly.
 * Also here we are comparing the object references are same or not. Not the content comparison.
 * @author Surendar
 *
 */
public class IdentityHashMapEx {

  public static void main(String[] args) {
    String s1 = "aaa";
    Map<String, Integer> mp = new IdentityHashMap<>();
    mp.put(s1, 10);    
    mp.put(new String("aaa"), 20);
    mp.put("ccc", 10);
    mp.put(new String("ccc"), 10);
    System.out.println("Map size :"+mp.size());
    System.out.println("Map elements :"+mp);
  }
}

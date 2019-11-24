package main.collectionex.pgms;

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable extends Dictionary abstract class and implements Map, Cloneable and Serializable interfaces.
 * It default stores the element in HashTable itself. It is also like HashMap. 
 * It uses hashCode to find the hash and then find the index bucket location based on the current capacity.
 * (i.e.) (hash & 0x7FFFFFFF) % tab.length => table => hashtable. It returns the capacity
 * @author Surendar
 *
 */
public class HashTableEx {

  public static void main(String[] args) {
    
    // The below HashTable constructor will create HashTable with 11 as capacity and 0.75 a load factor
    Map<Integer, String> ht = new Hashtable<>();
    
    // hash = 7, so, (7 & 0x7FFFFFFF) % 11 => 7 % 11 => 7. So, it stores the element in 7th index bucket location
    ht.put(7, "aa");  
    ht.put(11, "ba");
    ht.put(1, "ad");
    ht.put(15, "sa");
    ht.put(20, "rea");
    
    // hash = 18, so, (18 & 0x7FFFFFFF) % 11 => 18 % 11 => 7. So, it stores the element in 7th index bucket location.
    // But we already have one element then this new element will have next pointer variable. It will point to the element whcih already exists.
    // Then this new element will be placed in the 7th index.
    ht.put(18, "ewa");

    // When we iterate the elements it will iterate from top to bottom and right to left only.
    // Same index we have a possibility of multiple elements. So, it will read it from right to left.
    System.out.println(ht);
  }
}

package main.collectionex.pgms;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap extends HashMap class and implements a Map interface.
 * Internally LinkedHashMap stores as HashMap bucket using hashing concept. 
 * So, for maintaining the insertion order it will have two more variables in Node section and two more pointers in the LinkedHashMap class section.
 * In HashMap each element will be stored based on the hash bucket. So, the first element stores in one index bucket location and further element stores in other bucket location.
 * So, we don't know which element inserted after the first node and so on. For traversing through one by one LinkedHashMap we have a static Entry class which holds two more variables before and after
 * Before will holds the previous inserted element and after holds as Null for current element. But the previous element after variable will be updated with new inserted element  
 * In class section for iterating with start and end it will hold head and tail (i.e) head and tail node variable. This contains first Node element and Last node element
 * @author Surendar
 *
 */
public class LinkedHashMapStoringLogic {
  /*
   * HashMap having below method call only to find the hash of the key   * 
   * If the corresponding key object is having hashCode method means it will call the corresponding hashCode method to get the hash code.
   * For ex: In our case we are passing String object as a key then it will call the corresponding String class hashCode method to get the hash code.
  */
  static final int hash(Object key) {    
    int h;    
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
  }
  
  
  public static void main(String[] args) {
    // HashMap class is having the below logic only to find the bucket location.
    // If the bucket capacity is low means then we have a possibility of getting the same bucket location
    // For ex : In our below case bucket capacity is 16. To find the bucket location hash map uses bucket_location_index = (current_capacity - 1) & hash_value_of_the_key
    // So, in our case if the bucket capacity is 16 then below keys will get same bucket location. 
    
    System.out.println(15 & hash("re")); // hash("re") => 3635
    System.out.println(15 & hash("Re")); // hash("Re") => 2643
    System.out.println(15 & hash("dw")); // hash("dw") => 3219 

    // So, if you change the bucket location to 127 then it won't get the same bucket location.
    // So, as per the below example if key is different and hash code also different 
    // then also we may have a possibility to get the same bucket location for certain objects based on the bucket capacity
    
    System.out.println(127 & hash("re")); // hash("re") => 3635
    System.out.println(127 & hash("Re")); // hash("Re") => 2643
    System.out.println(127 & hash("dw")); // hash("dw") => 3219   

    
    // If you pass the default capcity as 10 then also it will allocate 16 buckets only.
    // If we pass as 17 then it will allocate 32 buckets and if you pass 33 it will allocate 64 like that it will allocate with 16 doubles only based on unsigned right shift operation 
    Map<String, Integer> lhs = new LinkedHashMap<>(16, 0.95F);
    lhs.put("aaa", 10);
    lhs.put("bbb", 10);
    lhs.put("Fb", 10);
    lhs.put("ccc", 10);
    lhs.put("Ea", 10);
    lhs.put("Es", 10);
    lhs.put("Fa", 10);
    lhs.put("re", 10);
    lhs.put("Ra", 10);
    lhs.put("Re", 10);
    lhs.put("Rer", 10);
    lhs.put("ls", 10);
    lhs.put("de", 10);
    lhs.put("rd", 10);
    lhs.put("fd", 10);
    lhs.put("dw", 10);
    lhs.put("der", 10);
    
    System.out.println(lhs);
  }
}

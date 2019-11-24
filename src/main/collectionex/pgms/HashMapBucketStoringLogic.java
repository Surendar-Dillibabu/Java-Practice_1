package main.collectionex.pgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBucketStoringLogic {

  /*
   * This below method code only present in the HashMap class to find the hash of
   * the key
   */
  static final int hash(Object key) {
    int h;
    // If the key is string means it will call the corresponding String class
    // hashCode method to get the hash code.
    // If not then it will call the object class hashCode method which will be
    // native method to get the hash code using the memory location
    // Consider if we are giving key as String. For input "bbb" the hashCode will be
    // 97314. Now (97314 >>> 16) right unsigned operation will be performed.
    // i.e. (10111110000100010 >>> 16) = 000000000000001. i.e. 1. Then bitwise xor
    // operation.
    // i.e. 10111110000100010 ^ 1. (i.e.) (10111110000100010 ^ 000000000000001) =
    // 10111110000100011. (97315)
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
  }

  public static void main(String[] args) {
    int hashCode = "bbb".hashCode();
    System.out.println("Hash code binary value :" + Integer.toBinaryString(hashCode));
    int afterUnsignedRightOperation = hashCode >>> 16;
    System.out.println("After performing unsigned right shift operation :" + afterUnsignedRightOperation);
    int hash = hashCode ^ (afterUnsignedRightOperation);
    System.out.println("Final hash value :" + hash);
    System.out.println("Final hash binary value :" + Integer.toBinaryString(hash));

    System.out.println("Final hash value using the HashMap hash function code logic :" + hash("bbb"));

    Map<String, Integer> hm = new HashMap<>();
    hm.put("aaa", 10);

    // Now while inserting it has to find the bucket location where to put this
    // key-value pair entry
    // Now it will use the hash value and then the current capacity length of the
    // bucket to find the bucket location.
    // Initial bucket capacity is 16
    // index = (n - 1) & hash. i.e. index = (16 -1) & 97315 = 15 & 97315
    // index = (00000000000001111 & 10111110000100011) = 00000000000000011 = 3
    // Now it will store the corresponding below key-value pair in the 3rd bucket
    // location
    // debug the code to find the result
    hm.put("bbb", 10);
    hm.put("ccc", 10);

    // HashMap class is having the below logic only to find the bucket location.
    // If the bucket capacity is low means then we have a possibility of getting the
    // same bucket location
    // For ex : In our below case bucket capacity is 16. To find the bucket location
    // hash map uses bucket_location_index = (current_capacity - 1) &
    // hash_value_of_the_key
    // So, in our case if the bucket capacity is 16 then below keys will get same
    // bucket location.

    System.out.println(15 & hash("re")); // hash("re") => 3635
    System.out.println(15 & hash("Re")); // hash("Re") => 2643
    System.out.println(15 & hash("dw")); // hash("dw") => 3219

    // So, if you change the bucket location to 127 then it won't get the same
    // bucket location.
    // So, as per the below example if key is different and hash code also different
    // then also we may have a possibility to get the same bucket location for
    // certain objects based on the bucket capacity

    System.out.println(127 & hash("re")); // hash("re") => 3635
    System.out.println(127 & hash("Re")); // hash("Re") => 2643
    System.out.println(127 & hash("dw")); // hash("dw") => 3219

    Set<Map.Entry<String, Integer>> st = hm.entrySet();
    st.forEach(System.out::println);
  }
}

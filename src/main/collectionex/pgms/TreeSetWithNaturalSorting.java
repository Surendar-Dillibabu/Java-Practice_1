package main.collectionex.pgms;

import java.util.Set;
import java.util.TreeSet;

/**
 * Internally TreeSet uses TreeMap to store the values. Added values will act as a key in the TreeMap and then values will be constant Object reference for all the keys in the TreeMap 
 * @author Surendar
 *
 */
public class TreeSetWithNaturalSorting {

  public static void main(String[] args) {
    Set<String> ts = new TreeSet<>();
    
    // If we uncomment the below code then we will get NullPointerException.
    // Since TreeSet uses comparable to compare the values for Sorting. So, we will get NullPointerException.
    // Upto 1.6 we can add null values at the first element then it will accept. But if we add another element then we will get NullPointerException since it needs to be compared with existing value (i.e. null)
    // From 1.7 onwards null values won't be allowed even it is first insered value
    // ts.add(null);
    
    ts.add("a");
    ts.add("A");
    ts.add("z");
    ts.add("L");
    ts.add("Z");
    
    // If we uncomment the below code then we will get "Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer" error
    // Since TreeSet follows natural sorting order based on the object by using comparable. If two objects are different when comparing then we will get the ClassCastException
    // ts.add(10);    
    
    // Output will be Captial letters will come based on alphabetical order and then small letters will come based on alphabetical order.
    // Since Java follows unicode characters approach capital 'A' unicode is 65 and small 'a' unicode is 97   
    System.out.println(ts); // [A, L, Z, a, z]
  }
}

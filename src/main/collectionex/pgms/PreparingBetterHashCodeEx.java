package main.collectionex.pgms;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PreparingBetterHashCodeEx {

  public static void main(String[] args) {

    class MyKey {

      final Integer i;

      public MyKey(Integer i) {
        this.i = i;
      }

      @Override
      public int hashCode() { 
        // For same hashcode for all elements it taken 15 seconds. Since it has to put all the entry in same bucket location.
        return 1;
        // int key = 2097152-1;
        // return key+2097152*i;
        // For different hashcode for all individual elements it taken only milliseconds
        // return i;
      }

      @Override
      public boolean equals(Object obj) {
        if (obj instanceof MyKey) {
          return i.equals(((MyKey) obj).i);
        } else
          return false;
      }

    }

    Long startTime = System.currentTimeMillis();
    System.out.println("Start time :" + startTime);
    Map<MyKey, String> myMap = new HashMap<>(500_000, 1);
    for (int lp1 = 0; lp1 < 500_000; lp1++) {
      myMap.put(new MyKey(lp1), "value-" + lp1);
    }
    Long endTime = System.currentTimeMillis();
    System.out.println("End time :" + endTime);
    System.out.println("Time taken in seconds :" + (TimeUnit.MILLISECONDS.toSeconds((endTime - startTime))));
  }
}

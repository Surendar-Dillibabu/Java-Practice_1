package main.collectionex.pgms;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * WeakHashMap is similar to HashMap. But in-case of HashMap it is having
 * storing reference. In-case of WeakHashMap it is having weak reference. (i.e.)
 * If the object which is referred by HashMap is assigned as null means then
 * also garbage collector won't have access to collect or destroy the object
 * since HashMap is having reference with it. HashMap dominates over Garbage
 * collector. But in case of WeakHashMap the object which is present in the
 * WeakHashMap is assigned to null means then the garbage collector will have
 * access to collect or destroy the object since WeakHashMap is having weak
 * reference. Garbage collector dominates over WeakHashMap. So, if the object is
 * deleted then the corresponding entry also won't be there in the WeakHashMap
 * 
 * @author Surendar
 *
 */
public class WeakHashMapEx {

  class Temp {

    public String toString() {
      return "temp";
    }

    public void finalize() {
      System.out.println("Finalize method called by garbage collector");
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Map<Temp, String> mp = new WeakHashMap<>();
    Temp t1 = new WeakHashMapEx().new Temp();
    mp.put(t1, "t1-obj");
    System.out.println(mp);
    t1 = null;

    System.gc(); // Garbage collector calls is initiated

    Thread.sleep(5000); // sleeping 5 seconds for garbage collector to completes its action

    System.out.println(mp);
  }
}

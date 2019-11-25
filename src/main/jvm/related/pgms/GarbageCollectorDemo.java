package main.jvm.related.pgms;

import java.util.Date;

public class GarbageCollectorDemo {

  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    System.out.println("Total memory :" + r.totalMemory());
    System.out.println("Free memory :" + r.totalMemory());

    for (int lp1 = 0; lp1 < 10000; lp1++) {
      Date date = new Date();
      date = null;
    }

    System.out.println("Free memory after creating 10000 objects :" + r.freeMemory());

    r.gc();

    System.out.println("Free memory after calling garbage collector :" + r.freeMemory());
  }
}

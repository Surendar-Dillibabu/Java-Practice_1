package main.java8.ex.pgms.supplier;

import java.util.function.LongSupplier;

public class LongSupplierEx {

  public static void main(String[] args) {
    LongSupplier lSup = () -> 10;
    System.out.println(lSup.getAsLong());

    LongSupplier lSup1 = () -> 10 - 5;
    System.out.println(lSup1.getAsLong());
  }
}

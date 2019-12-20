package main.java8.ex.pgms.supplier;

import java.util.function.IntSupplier;

public class IntSupplierEx {

  public static void main(String[] args) {
    IntSupplier iSup = () -> 10;
    System.out.println(iSup.getAsInt());
    
    IntSupplier iSup1 = () -> 10 - 5;
    System.out.println(iSup1.getAsInt());
  }
}

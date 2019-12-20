package main.java8.ex.pgms.supplier;

import java.util.function.BooleanSupplier;

public class BooleanSupplierEx {

  public static void main(String[] args) {
    BooleanSupplier bSup = () -> false;
    System.out.println(bSup.getAsBoolean()); 
    
    BooleanSupplier bSup1 = () -> "Java".equals("Java");
    System.out.println(bSup1.getAsBoolean());
  }
}

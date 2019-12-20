package main.java8.ex.pgms.supplier;

import java.util.function.DoubleSupplier;

public class DoubleSupplierEx {

  public static void main(String[] args) {
    DoubleSupplier dSup = () -> 10;
    System.out.println(dSup.getAsDouble());

    DoubleSupplier dSup1 = () -> 10 - 5;
    System.out.println(dSup1.getAsDouble());
  }
}

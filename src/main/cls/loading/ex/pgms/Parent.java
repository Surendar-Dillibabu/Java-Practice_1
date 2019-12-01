package main.cls.loading.ex.pgms;

public class Parent {
  
  //compile time constant, accessing this will not trigger class initialization
  protected static final String familyName = "Khan";

  // Not a compile time constant accessing this will trigger class initialization
  // protected static String familyName = "Khan";

  // static members initializer block
  static {
    System.out.println("static block of Super class is initialized");
  }
  // instance members initializer block
  {
    System.out.println("non static blocks in super class is initialized");
  }

}

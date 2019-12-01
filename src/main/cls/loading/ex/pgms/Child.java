package main.cls.loading.ex.pgms;

public class Child extends Parent {

  // static members initializer block
  static {
    System.out.println("static block of Sub class is initialized in Java ");
  }

  // instance members initializer block
  {
    System.out.println("non static blocks in sub class is initialized");
  }

}

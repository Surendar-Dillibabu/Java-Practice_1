package main.innerclass.ex;

import main.innerclass.ex.IOuter.IInner;

public class Test2 implements IInner {

  @Override
  public void m2() {
    System.out.println("Inner interface m2 method");
  }

  public static void main(String[] args) {
    Test2 obj = new Test2();
    obj.m2();
  }
}

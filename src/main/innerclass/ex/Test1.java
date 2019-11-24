package main.innerclass.ex;

public class Test1 implements IOuter {

  @Override
  public void m1() {
    System.out.println("Outer interface m1 method");
  }

  public static void main(String[] args) {
    Test1 obj = new Test1();
    obj.m1();
  }
}

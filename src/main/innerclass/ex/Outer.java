package main.innerclass.ex;

public class Outer {

  public void test() {
    int a = 10;
    Runnable i = new Runnable() {

      @Override
      public void run() {
        int j = a * a;
        System.out.println(j);
      }
    };
    System.out.println(i);
  }
}
package main.innerclass.ex;


public class InnerClassEx {

  public void m1() {
    int x = 10;
    
    class InnerClass {
      public void m2() {
        System.out.println(x);
      }
    }
    
    InnerClass i = new InnerClass();
    i.m2();
  }
  
  public static void main(String[] args) {
    InnerClassEx ie = new InnerClassEx();
    ie.m1();
  }
}

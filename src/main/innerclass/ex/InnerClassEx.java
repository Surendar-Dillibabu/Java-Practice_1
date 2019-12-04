package main.innerclass.ex;


public class InnerClassEx {
  
  public static int t = 52;

  public void m1() {
    int x = 10;
    
    class InnerClass {
      public void m2() {
        System.out.println(x);
        System.out.println(t);
        m3();
      }
    }
    
    InnerClass i = new InnerClass();
    i.m2();
  }
  
  public static void main(String[] args) {
    InnerClassEx ie = new InnerClassEx();
    ie.m1();
  }
  
  public void m3() {
    System.out.println(t);
  }
}


package main.stat.member.pgms;


public class Child extends Parent {
  
  static {
    System.out.println("Child static block");
  }
  {
    System.out.println("Child initizilation block");
  }
  
  Child() {    
    System.out.println("Child constructor");
  }
  
  public static void main(String args[]) {
    System.out.println("Child main method");
    Child c = new Child();
    System.out.println(c);
  }
}

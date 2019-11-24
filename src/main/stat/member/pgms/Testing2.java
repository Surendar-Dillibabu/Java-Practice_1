package main.stat.member.pgms;


public class Testing2 {

  public static void main(String[] args) {
    Testing2 test = new Testing2();
    test.m1();  
    System.out.println("Inside main method block");
  }
  
  public void m1() {
    try {
      System.out.println("Inside try block");
      System.exit(0);
    }catch(ArithmeticException ex) {
      System.out.println("Inside catch block");
    } finally {
      System.out.println("Inside finally block");
    }
  }
}

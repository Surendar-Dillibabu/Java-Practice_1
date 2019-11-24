package main.langpkg.ex;


public class ExceptionInInitializerErrorEx {

  private static int arr[];
  
  static void m1() {
    // throw new RuntimeException();
    // or
    System.out.println(arr[2]);
  }
  
  static {
    m1();
  }
  
  public static void main(String[] args) {
    System.out.println("Main method");
  }
}

package main.cls.loading.ex.pgms;

public class ClassInitializationTest {

  public static void main(String args[]) throws InterruptedException {
    /*
    NotUsed o = null; // this class is not used, should not be initialized
    Child t = new Child(); // initializing sub class, should trigger super class initialization
    System.out.println((Object) o == (Object) t);
    */
    
    System.out.println(Parent.familyName);
  }

}

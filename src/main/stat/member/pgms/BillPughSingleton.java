package main.stat.member.pgms;

/**
 * In this example the inner class static block will be executed only when we access inner class
 * @author Surendar
 *
 */
public class BillPughSingleton {

  private BillPughSingleton(){}
  
  static {
    System.out.println("Top class staic block");
  }
  
  private static class SingletonHelper{
      private static final BillPughSingleton INSTANCE = new BillPughSingleton();
      
      static {
        System.out.println("Inner class staic block");
      }
  }
  
  public static BillPughSingleton getInstance(){
      return SingletonHelper.INSTANCE;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method");
    getInstance();
  }
}

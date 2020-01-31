package main.java8.interfaces.ex.pgms;

public interface InterfaceA {

  default void print() {
    System.out.println("InterfaceA print method called");
  }
  
  static void displayMsg() {
    System.out.println("InterfaceA display method called");
  }

}

package main.java8.interfaces.ex.pgms;

public class ClassC implements InterfaceA, InterfaceB {

  public static void main(String[] args) {
    ClassC obj = new ClassC();
    obj.display();
  }
  
  public void display() {
    print();
  }

  @Override
  public void print() {
    InterfaceA.super.print();
    InterfaceA.displayMsg();
  }
}

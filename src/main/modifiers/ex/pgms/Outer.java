package main.modifiers.ex.pgms;

/* Java program to demonstrate whether we can override private method 
of outer class inside its inner class */
public class Outer {
  private String msg = "GeeksforGeeks";

  private void fun() {
    System.out.println("Outer fun()");
  }
  
  public void display() {
    System.out.println("Outer display method called");
  }

  class Inner extends Outer {
    private void fun() {
      System.out.println("Accessing Private Member of Outer: " + msg);
    }
    
    // Here the inner class is overriding the outer class method since the outer class display method is declared as public.
    public void display() {
      System.out.println("Inner display method called");
    }
  }

  public static void main(String args[]) {

    // In order to create instance of Inner class, we need an Outer
    // class instance. So, first create Outer class instance and then
    // inner class instance.
    Outer o = new Outer();
    Inner i = o.new Inner();

    // This will call Inner's fun, the purpose of this call is to
    // show that private members of Outer can be accessed in Inner.
    i.fun();
    
    // Here the object and the reference both are pointing to inner class. So, it will call only the inner class display method
    i.display();

    // o.fun() calls Outer's fun (No run-time polymorphism).
    o = i;
    
    // This won't call inner class fun method. Since the outer class fun method is declared as private. Private methods are not overridden in java
    // So, private methods are bonded at compile time itself. It means it will be statically binded
    // so, it will call only the outer class fun method even though the object is belongs to inner class
    o.fun();
    
    // Here the object is inner class object but reference is outer class reference. Here also it will call only the inner class object since the public methods are bonded at compile time.
    // It will be bound based on dynamic binding. So, it will call inner class method only
    o.display();
  }
}

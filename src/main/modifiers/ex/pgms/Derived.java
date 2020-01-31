package main.modifiers.ex.pgms;

class Derived extends Base { 
  private void fun() { 
     System.out.println("Derived fun");   
  } 
  public static void main(String[] args) {
    Derived obj = new Derived(); 
    obj.fun();
    obj.baseDisplay();
  }   
}

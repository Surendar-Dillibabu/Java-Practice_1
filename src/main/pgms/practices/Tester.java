package main.pgms.practices;

public class Tester {

  public static void main(String[] args) {
    System.out.println(Math.pow(5, 3));
    Parent c = new Child();
    ((Child) c).print();

  }
}

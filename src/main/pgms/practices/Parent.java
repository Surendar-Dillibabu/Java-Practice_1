package main.pgms.practices;

public abstract class Parent {

  public Parent() {
    System.out.println("Parent Constructor");
    init();
  }

  public void init() {
    System.out.println("parent Init()");
  }
}
package main.stat.member.pgms;

public class Parent {
  
  static {
    System.out.println("Parent static block");
  }
  {
    System.out.println("Parent initizilation block");
  }
  
  Parent() {   
    System.out.println("Parent constructor");
  }

}

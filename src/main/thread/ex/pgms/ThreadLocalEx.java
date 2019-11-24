package main.thread.ex.pgms;


public class ThreadLocalEx {

  public static void main(String[] args) {
    ThreadLocal<String> tl = new ThreadLocal<>();
    System.out.println("Initial value :"+tl.get());
    tl.set("TEST");
    System.out.println("Value after added :"+tl.get());
    tl.remove();
    System.out.println("Value after removed :"+tl.get());
  }
}

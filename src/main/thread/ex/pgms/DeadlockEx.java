package main.thread.ex.pgms;

class A {

  public synchronized void a1(B b) {
    System.out.println("From a1 method of A class");
    b.last();
  }

  public synchronized void last() {
    System.out.println("From last method of A class");
  }
}

class B {

  public synchronized void b1(A a) {
    System.out.println("From b1 method of B class");
    a.last();
  }

  public synchronized void last() {
    System.out.println("From last method of B class");
  }
}

public class DeadlockEx extends Thread {

  static A a = new A();
  static B b = new B();

  @Override
  public void run() {
    b.b1(a);
  }

  public void m1() {
    this.start();
    a.a1(b);
  }

  public static void main(String[] args) {
    DeadlockEx d = new DeadlockEx();
    d.m1();
  }
}

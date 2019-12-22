package main.thread.ex.pgms;

public class DeadLockEx {

  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    MyThread1 t1 = new MyThread1("Thread-1", a, b);
    MyThread2 t2 = new MyThread2("Thread-2", a, b);
    t1.start();
    t2.start();
  }
}

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

class MyThread1 extends Thread {

  A a;
  B b;

  MyThread1(String threadName, A a, B b) {
    super(threadName);
    this.a = a;
    this.b = b;
  }

  @Override
  public void run() {
    a.a1(b);
  }
}

class MyThread2 extends Thread {

  A a;
  B b;

  MyThread2(String threadName, A a, B b) {
    super(threadName);
    this.a = a;
    this.b = b;
  }

  @Override
  public void run() {
    b.b1(a);
  }
}

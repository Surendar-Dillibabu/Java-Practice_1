package main.concurrent.locks.ex.pgms;

import java.util.concurrent.locks.ReentrantLock;

class DisplayWish2 {

  ReentrantLock l = new ReentrantLock();

  public void wish(final String name) {
    l.lock();
    for (int lp1 = 0; lp1 < 10; lp1++) {
      System.out.print("Good morning :");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("InterruptedException catch block");
      }
      System.out.println(name);
    }
    l.unlock();
  }
}

class ChildThread5 extends Thread {

  DisplayWish2 d;
  String name;

  public ChildThread5(DisplayWish2 d, String name) {
    this.d = d;
    this.name = name;
  }

  @Override
  public void run() {
    d.wish(name);
  }
}

public class ReentrantLockEx1 {

  public static void main(String[] args) {
    DisplayWish2 d = new DisplayWish2();
    ChildThread5 t1 = new ChildThread5(d, "Surendar");
    ChildThread5 t2 = new ChildThread5(d, "Deepan");
    t1.start();
    t2.start();
  }
}

package main.thread.ex.pgms;

class DisplayNumChar {

  public synchronized void displayNum() {
    for (int lp1 = 0; lp1 < 10; lp1++) {
      System.out.print(lp1);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("displayNum InterruptedException catch block");
      }
    }
  }

  public static synchronized void displayChar() {
    for (int lp1 = 65; lp1 < 75; lp1++) {
      System.out.print((char) lp1);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("displayChar InterruptedException catch block");
      }
    }
  }
}

class MyChild1 extends Thread {

  DisplayNumChar d;

  public MyChild1(DisplayNumChar d) {
    this.d = d;
  }

  @Override
  public void run() {
    d.displayNum();
  }
}

class MyChild2 extends Thread {

  DisplayNumChar d;

  public MyChild2(DisplayNumChar d) {
    this.d = d;
  }

  @Override
  public void run() {
    d.displayChar();
  }
}

public class SynchorizeEx3 {

  public static void main(String[] args) {
    Object ob;
    DisplayNumChar d = new DisplayNumChar();
    MyChild1 child1 = new MyChild1(d);
    MyChild2 child2 = new MyChild2(d);
    child1.start();
    child2.start();
  }
}

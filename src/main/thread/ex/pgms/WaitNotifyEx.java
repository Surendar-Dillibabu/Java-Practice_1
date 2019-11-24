package main.thread.ex.pgms;

class MyChild5 extends Thread {

  int total = 0;

  @Override
  public void run() {
    synchronized (this) {
      System.out.println("Entered into the child thread synchronized block");
      for (int lp1 = 1; lp1 <= 100; lp1++) {
        total += lp1;
      }
      System.out.println("Child thread sleeping for 2 seconds");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }      
      this.notify();
    }
  }
}

public class WaitNotifyEx {

  public static void main(String[] args) throws InterruptedException {
    MyChild5 t1 = new MyChild5();
    t1.start();    
    synchronized (t1) {
      System.out.println("Entered into the main synchronized block");
      t1.wait();
      System.out.println("Main thread got notification");
      System.out.println("total :" + t1.total);
    }
  }
}

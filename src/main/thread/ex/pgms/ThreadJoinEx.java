package main.thread.ex.pgms;

class ChildThread extends Thread {

  @Override
  public void run() {
    for (int lp1 = 0; lp1 < 10; lp1++) {
      System.out.println("Child thread");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("InterruptedException catch block");
      }
    }
  }
}

public class ThreadJoinEx {

  public static void main(String[] args) throws InterruptedException {
    ChildThread t1 = new ChildThread();
    t1.start();
    t1.join(5000);
    for (int lp1 = 0; lp1 < 10; lp1++) {
      System.out.println("Main thread");
    }
  }
}

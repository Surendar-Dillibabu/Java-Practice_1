package main.thread.ex.pgms;

class ChildThread2 extends Thread {

  public static Thread mt;

  @Override
  public void run() {
    for (int lp1 = 0; lp1 < 10; lp1++) {
      try {
        mt.join();
      } catch (InterruptedException e) {
        System.out.println("InterruptedException catch block");
      }
      System.out.println("Child thread");
    }
  }
}

public class ThreadJoinEx2 {

  public static void main(String[] args) throws InterruptedException {
    ChildThread2.mt = Thread.currentThread();
    ChildThread2 t1 = new ChildThread2();
    t1.start();
    // This below line will create a deadlock situation
    // t1.join();
    for (int lp1 = 0; lp1 < 10; lp1++) {
      System.out.println("Main thread");
      Thread.sleep(1000);
    }
  }
}

package main.concurrency.ex.pgms;

import java.util.concurrent.Semaphore;

public class MultiThreading {
  public static void main(String[] args) throws InterruptedException {
    Semaphore sem = new Semaphore(1, false);

    Thread t1 = new MyThread1(5, sem);
    Thread t2 = new MyThread1(4, sem);
    Thread t3 = new MyThread1(3, sem);
    Thread t4 = new MyThread1(2, sem);
    Thread t5 = new MyThread1(1, sem);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    Thread.sleep(3000);
    t1.interrupt();
  }
}

class MyThread1 extends Thread {
  int var;
  Semaphore sem;

  public MyThread1(int a, Semaphore s) {
    var = a;
    sem = s;
  }

  @Override
  public void run() {
    System.out.println("Acquiring lock -- " + var);
    try {
      sem.acquire(var);
      System.out.println(var);

      System.out.println("Releasing lock -- " + var);
      sem.release(var + 1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("QueueLength :"+sem.getQueueLength()+" var :"+var);
  }
}
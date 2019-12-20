package main.concurrent.locks.ex.pgms;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

  public static void main(String args[]) throws InterruptedException {
    // Let us create task that is going to
    // wait for four threads before it starts
    CountDownLatch latch = new CountDownLatch(2);

    // Let us create four worker
    // threads and start them.
    WorkerThread first = new WorkerThread(1000, latch, "WORKER-1");
    WorkerThread second = new WorkerThread(2000, latch, "WORKER-2");
    WorkerThread third = new WorkerThread(3000, latch, "WORKER-3");
    WorkerThread fourth = new WorkerThread(4000, latch, "WORKER-4");
    first.start();
    second.start();
    third.start();
    fourth.start();

    // The main task waits for four threads
    latch.await();

    // Main thread has started
    System.out.println(Thread.currentThread().getName() + " has finished");
  }
}

//A class to represent threads for which 
//the main thread waits. 
class WorkerThread extends Thread {
  private int delay;
  private CountDownLatch latch;

  public WorkerThread(int delay, CountDownLatch latch, String name) {
    super(name);
    this.delay = delay;
    this.latch = latch;
  }

  @Override
  public void run() {
    try {
      if ("WORKER-3".equalsIgnoreCase(Thread.currentThread().getName())
          || "WORKER-4".equalsIgnoreCase(Thread.currentThread().getName())) {
        latch.await();
      }
      Thread.sleep(delay);
      latch.countDown();
      System.out.println(Thread.currentThread().getName() + " finished");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
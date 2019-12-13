package main.concurrency.ex.pgms;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

  public static void main(String[] args) throws InterruptedException {
    Semaphore sem = new Semaphore(1);
    MyThread t1 = new MyThread(sem, "A");
    MyThread t2 = new MyThread(sem, "B");

    t1.start();
    t2.start();

    t1.join();
    t2.join();
    System.out.println("Main thread completed");
  }
}

class Shared {
  public static int count = 0;
}

class MyThread extends Thread {

  private Semaphore sem;
  private String threadName;

  MyThread(Semaphore sem, String threadName) {
    super(threadName);
    this.sem = sem;
    this.threadName = threadName;
  }

  @Override
  public void run() {

    if ("A".equalsIgnoreCase(threadName)) {
      try {
        System.out.println(
            "Thread " + threadName + " waiting to acquire the lock. Available permits :" + sem.availablePermits());
        // calls to acquire will wait or block until permitted
        sem.acquire();

        // Acquired the lock. No other thread are allowed unless this thread releases
        // the lock
        System.out.println("Thread " + threadName + " acquired the lock");
        for (int lp1 = 0; lp1 < 5; lp1++) {
          Shared.count++;
          System.out.println("Thread " + threadName + " increased the Shard class count :" + Shared.count);
          Thread.sleep(1000);
        }

        // Releases the lock so other thread will acquire the lock
        sem.release();
        System.out.println("Thread " + threadName + " releases the lock. Available permits :" + sem.availablePermits());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    } else {
      try {
        System.out.println(
            "Thread " + threadName + " waiting to acquire the lock. Available permits :" + sem.availablePermits());
        // calls to acquire will wait or block until permitted
        sem.acquire();

        // Acquired the lock. No other thread are allowed unless this thread releases
        // the lock
        System.out.println("Thread " + threadName + " acquired the lock");
        for (int lp1 = 0; lp1 < 5; lp1++) {
          Shared.count--;
          System.out.println("Thread " + threadName + " decreased the Shard class count :" + Shared.count);
          Thread.sleep(1000);
        }

        // Releases the lock so other thread will acquire the lock
        sem.release();
        System.out.println("Thread " + threadName + " releases the lock. Available permits :" + sem.availablePermits());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
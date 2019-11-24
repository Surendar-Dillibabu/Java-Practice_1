package main.thread.ex.pgms;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantTryLockEx {

  ReentrantLock rl = new ReentrantLock();

  class ThreadEx implements Runnable {

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + " is entered into run method");
      boolean lockFlag = rl.tryLock();
      System.out.println(Thread.currentThread().getName() + " lock flag :" + lockFlag);
      if (lockFlag) {
        try {
          for (int lp1 = 0; lp1 < 5; lp1++) {
            System.out.println(Thread.currentThread().getName() + " lp1 :" + lp1);
            try {
              Thread.sleep(2000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        } finally {
          rl.unlock();
        }
        System.out.println(Thread.currentThread().getName() + " completes its action");
      } else {
        System.out.println(Thread.currentThread().getName() + " can't get the lock");
      }
    }

  }

  public static void main(String[] args) {
    ReentrantTryLockEx obj = new ReentrantTryLockEx();
    Thread t1 = new Thread(obj.new ThreadEx());
    Thread t2 = new Thread(obj.new ThreadEx());

    t1.start();
    t2.start();

    System.out.println("Main thread completes its action");
  }
}

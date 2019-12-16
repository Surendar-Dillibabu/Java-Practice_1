package main.concurrent.locks.ex.pgms;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantTryLockWithTimingsEx {

  ReentrantLock rl = new ReentrantLock();

  class ThreadEx implements Runnable {

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + " is entered into run method");
      boolean lockFlag = false;
      try {
        lockFlag = rl.tryLock(6000, TimeUnit.MILLISECONDS); // If you change the time as 4000 milliseconds then it will
                                                            // get the lock
      } catch (InterruptedException e1) {
        e1.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " lock flag :" + lockFlag);
      if (lockFlag) {
        try {
          for (int lp1 = 0; lp1 < 5; lp1++) {
            System.out.println(Thread.currentThread().getName() + " lp1 :" + lp1);
            try {
              rl.lock(); // Getting one-more lock inside the loop. So, one thread will get 5 locks
              Thread.sleep(1000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            } finally {
              System.out.println(
                  Thread.currentThread().getName() + " lock count before releasing inner lock :" + rl.getHoldCount());
              rl.unlock();
            }
          }
        } finally {
          System.out.println(
              Thread.currentThread().getName() + " lock count before releasing outer lock :" + rl.getHoldCount());
          rl.unlock();
        }
        System.out.println(Thread.currentThread().getName() + " completes its action");
      } else {
        System.out.println(Thread.currentThread().getName() + " can't get the lock");
      }
    }

  }

  public static void main(String[] args) throws InterruptedException {
    ReentrantTryLockWithTimingsEx obj = new ReentrantTryLockWithTimingsEx();
    Thread t1 = new Thread(obj.new ThreadEx(), "Thread-1");
    Thread t2 = new Thread(obj.new ThreadEx(), "Thread-2");

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("Main thread completes its action");
  }
}

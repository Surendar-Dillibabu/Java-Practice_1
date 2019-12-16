package main.concurrent.locks.ex.pgms;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierEx implements Runnable {

  public static CyclicBarrier barrier = new CyclicBarrier(4);

  @Override
  public void run() {

    Computation1 r2 = new Computation1(10, 5);
    Thread t2 = new Thread(r2, "Sum-Thread");
    t2.start();

    Computation2 r3 = new Computation2(5, 6);
    Thread t3 = new Thread(r3, "Multiply-Thread");
    t3.start();

    Computation3 r4 = new Computation3(50, 5);
    Thread t4 = new Thread(r4, "Divide-Thread");
    t4.start();

    try {
      System.out.println("Group thread start waiting for other thread to complete");
      barrier.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    }

    System.out.println("Group thread get completed. So, we can get collect the results");
    int totalSum = (r2.sum + r3.product + r4.division);
    System.out.println("Total sum :" + totalSum);

    System.out.println("Resetting the barrier for re-use");
    barrier.reset();
  }

  public static void main(String[] args) throws InterruptedException {
    CyclicBarrierEx r1 = new CyclicBarrierEx();
    Thread t1 = new Thread(r1, "Group-thread");
    t1.start();

    t1.join();

    System.out.println("Main thread completed execution");
  }
}

class Computation1 implements Runnable {

  public int sum = 0;
  private int num1;
  private int num2;

  Computation1(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  @Override
  public void run() {
    try {
      System.out.println(Thread.currentThread().getName() + " started. Number of barriers waiting :"
          + CyclicBarrierEx.barrier.getNumberWaiting());
      sum = (num1 + num2);
      System.out.println(Thread.currentThread().getName() + " result :" + sum);
      Thread.sleep(1000);
      CyclicBarrierEx.barrier.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    }

  }
}

class Computation2 implements Runnable {

  public int product = 0;
  private int num1;
  private int num2;

  Computation2(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  @Override
  public void run() {
    try {
      System.out.println(Thread.currentThread().getName() + " started. Number of barriers waiting :"
          + CyclicBarrierEx.barrier.getNumberWaiting());
      product = (num1 * num2);
      System.out.println(Thread.currentThread().getName() + " result :" + product);
      Thread.sleep(1000);
      // If we change the below await time to 1 seconds this await will throw
      // TimeoutException if the await exceeds the time.
      // It will throw TimeoutException. Due to this other barrier thread will throw
      // BrokenBarrierException on the subsequent await call on the corresponding same
      // barrier object
      CyclicBarrierEx.barrier.await(3, TimeUnit.SECONDS);
    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    } catch (TimeoutException e) {
      e.printStackTrace();
    }
  }
}

class Computation3 implements Runnable {

  public int division = 0;
  private int num1;
  private int num2;

  Computation3(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  @Override
  public void run() {
    try {
      System.out.println(Thread.currentThread().getName() + " started. Number of barriers waiting :"
          + CyclicBarrierEx.barrier.getNumberWaiting());
      division = (num1 / num2);
      System.out.println(Thread.currentThread().getName() + " result :" + division);
      Thread.sleep(3000);
      CyclicBarrierEx.barrier.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    }
  }
}
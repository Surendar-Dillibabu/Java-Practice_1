package main.concurrent.locks.ex.pgms;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class ReentrantReadWriteLockEx {
  private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
  private static final WriteLock writeLock = lock.writeLock();
  private static final ReadLock readLock = lock.readLock();

  private static String message = "a";

  public static void main(String[] args) throws InterruptedException {
    ReentrantReadWriteLockEx obj = new ReentrantReadWriteLockEx();
    Thread t1 = new Thread(obj.new WriterThreadA(), "Writer-A");
    Thread t2 = new Thread(obj.new WriterThreadB(), "Writer-B");
    Thread t3 = new Thread(obj.new ReaderThread(), "Reader");

    t1.start();
    t2.start();
    t3.start();

    // Main thread joined to other threads to wait for other thread completion.
    // Main thread will wait for all the other thread to complete then it will
    // execute the main thread remaining actions
    t1.join();
    t2.join();
    t3.join();

    System.out.println("Main thread completes its execution");
  }

  private class ReaderThread implements Runnable {

    @Override
    public void run() {

      if (lock.isWriteLocked()) {
        System.out.println("Write lock present");
      }

      readLock.lock();

      try {
        System.out.println(
            Thread.currentThread().getName() + " thread acquired read lock. Thread going to sleep for 5 seconds");
        Thread.sleep(3000);
        System.out.println("Message :" + message);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        System.out.println(Thread.currentThread().getName() + " thread releasing the read lock");
        readLock.unlock();
      }
    }
  }

  private class WriterThreadA implements Runnable {

    @Override
    public void run() {

      writeLock.lock();

      try {
        System.out.println(
            Thread.currentThread().getName() + " thread acquired write lock. Thread going to sleep for 3 seconds");
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        message = message.concat("a");
        System.out.println(Thread.currentThread().getName() + " thread releasing the write lock");
        writeLock.unlock();
      }
    }
  }

  private class WriterThreadB implements Runnable {

    @Override
    public void run() {

      writeLock.lock();

      try {
        System.out.println(
            Thread.currentThread().getName() + " thread acquired write lock. Thread going to sleep for 2 seconds");
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        message = message.concat("b");
        System.out.println(Thread.currentThread().getName() + " thread releasing the write lock");
        writeLock.unlock();
      }
    }
  }
}

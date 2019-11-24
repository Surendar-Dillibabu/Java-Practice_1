package main.collectionex.pgms;

import java.util.ArrayList;

public class ConcurrentModificationExceptionUsingThread {

  static ArrayList<Integer> al = new ArrayList<>();

  class WriteThread extends Thread {

    WriteThread(String threadName) {
      super(threadName);
    }

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + " started");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      al.add(68);
      System.out.println(Thread.currentThread().getName() + " completed");
    }
  }

  class ReadThread extends Thread {

    ReadThread(String threadName) {
      super(threadName);
    }

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + " started");
      for (Integer num : al) {
        System.out.println("Num :" + num);
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println(Thread.currentThread().getName() + " completed");
    }
  }

  public static void main(String[] args) {
    al.add(10);
    al.add(36);
    al.add(87);
    al.add(80);
    al.add(25);
    al.add(18);
    WriteThread writeThreadObj = new ConcurrentModificationExceptionUsingThread().new WriteThread("Write-thread");
    ReadThread readThreadObj = new ConcurrentModificationExceptionUsingThread().new ReadThread("Read-thread");

    writeThreadObj.start();

    readThreadObj.start();

    System.out.println("Main thread completed");
  }

}

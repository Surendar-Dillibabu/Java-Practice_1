package main.collectionex.pgms;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

  static ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<>();

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
      hm.put("dsa", 65);
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
      for (Map.Entry<String, Integer> entry : hm.entrySet()) {
        System.out.println("entry :" + entry);
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
    hm.put("tge", 35);
    hm.put("bw", 87);
    hm.put("aaa", 54);
    hm.put("ssd", 53);
    hm.put("ew", 7);
    hm.put("fds", 5);

    WriteThread writeThreadObj = new ConcurrentHashMapEx().new WriteThread("Write-thread");
    ReadThread readThreadObj = new ConcurrentHashMapEx().new ReadThread("Read-thread");

    writeThreadObj.start();

    readThreadObj.start();

    System.out.println("Main thread completed");
  }
}

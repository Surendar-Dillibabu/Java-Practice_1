package main.concurrent.locks.ex.pgms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class ProducerConsumerSemaphoreEx {

  public static void main(String[] args) {
    List<Character> strs = new ArrayList<Character>();
    Semaphore sem = new Semaphore(1);
    Thread t1 = new Thread(new ProducerSemaphore(strs, sem));
    Thread t2 = new Thread(new ConsumerSemaphore(strs, sem));
    t1.start();
    t2.start();
  }
}

class ProducerSemaphore implements Runnable {
  List<Character> strs;
  Semaphore sem;
  String alphabets = "abcdefghijklmnopqrstuvwxyz";

  ProducerSemaphore(List<Character> strs, Semaphore sem) {
    this.strs = strs;
    this.sem = sem;
  }

  public void run() {
    try {
      sem.acquire();
      System.out.println("Producer thread got the permit");
      for (int i = 0; i < 26; i++) {
        strs.add(alphabets.charAt(i));
      }
      Thread.sleep(2000);
      sem.release();
      System.out.println("Producer thread released the permit");
    } catch (InterruptedException e) {
      e.printStackTrace();
      Thread.currentThread().interrupt();
    }
  }

}

class ConsumerSemaphore implements Runnable {
  List<Character> strs;
  Semaphore sem;

  ConsumerSemaphore(List<Character> strs, Semaphore sem) {
    this.strs = strs;
    this.sem = sem;

  }

  public void run() {
    try {
      // The below sleep will make sure producer thread always start first
      Thread.sleep(1000);
      sem.acquire();
      System.out.println("Consumer thread got the permit");
      for (Character s : strs) {
        System.out.println(s);
      }
      sem.release();
      System.out.println("Consumer thread released the permit");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
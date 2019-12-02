package main.interview.pgms;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommEx {

  public static void main(String[] args) throws InterruptedException {
    Queue<String> q = new LinkedList<>();
    ProducerThread t1 = new ProducerThread(q);
    ConsumerThread t2 = new ConsumerThread(q);

    t1.start();
    t2.start();

    // Calling join to ask the main thread to wait and join once the t1 and t2
    // compltes
    t1.join();
    t2.join();

    System.out.println("Main thread completes its action");
  }
}

class ProducerThread extends Thread {
  private Queue<String> q;

  public ProducerThread(Queue<String> q) {
    super("Producer_Thread");
    this.q = q;
  }

  @Override
  public void run() {
    synchronized (q) {
      System.out.println("Enters into the producer thread");
      for (int lp1 = 1; lp1 <= 10; lp1++) {
        String element = "Product-" + lp1;
        System.out.println("Producer thread adding element in the queue :" + element);
        q.add(element);
      }
      q.notify();
    }
  }
}

class ConsumerThread extends Thread {
  private Queue<String> q;

  public ConsumerThread(Queue<String> q) {
    super("Consumer_Thread");
    this.q = q;
  }

  @Override
  public void run() {
    synchronized (q) {
      try {
        System.out.println("Enters into the consumer thread");
        if (q.isEmpty()) {
          System.out.println("Consumer thread calls wait method to wait for producer thread to add the element");
          q.wait();
        } else {
          for (String element : q) {
            System.out.println("Consumer thread - Element present in the queue :" + element);
          }
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

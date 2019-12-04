package main.collectionex.pgms;

import java.util.concurrent.BlockingQueue;

public class ProductProducer implements Runnable {

  private BlockingQueue<Product> queue;

  ProductProducer(BlockingQueue<Product> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    System.out.println("Product producer thread started");
    // queue add method will throw IllegalStateException incase the queue is full
    // while adding. But queue put method will wait for queue to get some space. But
    // it will throw InterruptedException since while waiting if any thread tries to
    // interrupt the queue
    try {
      for (int lp1 = 1; lp1 <= 10; lp1++) {
        Product p = new Product(lp1, "Product-" + lp1);
        queue.put(p);
        System.out.println("Product-" + lp1 + " has been added");
        Thread.sleep(500);
      }
      queue.put(new Product(0, "exit"));
    } catch (InterruptedException e1) {
      e1.printStackTrace();
    }
    System.out.println("Product producer thread ended");

  }

}

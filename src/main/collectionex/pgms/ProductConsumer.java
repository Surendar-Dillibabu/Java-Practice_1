package main.collectionex.pgms;

import java.util.concurrent.BlockingQueue;

public class ProductConsumer implements Runnable {

  private BlockingQueue<Product> queue;

  ProductConsumer(BlockingQueue<Product> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    System.out.println("Product consumer thread started");
    try {
      Product p = queue.take();
      while (p != null && p.getProductId() != 0) {
        System.out.println("Consumer thread product details :" + p);
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        p = queue.take();
      }
    } catch (InterruptedException e1) {
      e1.printStackTrace();
    }

    System.out.println("Product consumer thread ended");
  }
}

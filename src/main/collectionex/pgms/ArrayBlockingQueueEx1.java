package main.collectionex.pgms;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueEx1 {

  public static void main(String[] args) {
    BlockingQueue<Product> bQueue = new ArrayBlockingQueue<>(2);
    Thread p = new Thread(new ProductProducer(bQueue));
    Thread c = new Thread(new ProductConsumer(bQueue));

    p.start();

    c.start();

    System.out.println("Main thread completed");
  }
}

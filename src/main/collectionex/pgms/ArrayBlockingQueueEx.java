package main.collectionex.pgms;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {

  public static void main(String[] args) throws InterruptedException {
    // Only two elements alone will get inserted. After that it will block the
    // control and the main thread still get wait
    // After it is consumed then only it will add the next element
    // This concept mostly used in producer-consumer methodology
    ArrayBlockingQueue<String> bQueue = new ArrayBlockingQueue<String>(2);
    bQueue.put("Java");
    System.out.println("Item 1 inserted into BlockingQueue");
    bQueue.put("JDK");
    System.out.println("Item 2 is inserted on BlockingQueue");
    bQueue.put("J2SE");
    System.out.println("Done");

    System.out.println(bQueue);
  }
}

package main.thread.ex.pgms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DisplayThreadDetails implements Runnable {

  private String name;

  DisplayThreadDetails(final String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println("Started " + this.name + " thread. Thread name :" + Thread.currentThread().getName());
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      System.out.println("InterruptedException catch block");
    }
    System.out.println(this.name + " thread is completed. Thread name :" + Thread.currentThread().getName());
  }
}

public class ThreadPoolsEx {

  public static void main(String[] args) {
    ExecutorService service = Executors.newFixedThreadPool(4);
    DisplayThreadDetails[] objArr = { new DisplayThreadDetails("Surendar"), new DisplayThreadDetails("Vivek.B"),
        new DisplayThreadDetails("Arun"), new DisplayThreadDetails("Vivek.A"), new DisplayThreadDetails("Vasugi"),
        new DisplayThreadDetails("Sushmanth") };
    for (DisplayThreadDetails obj : objArr) {
      service.submit(obj);
    }
    service.shutdown();
    System.out.println("Main thread completed");
  }
}

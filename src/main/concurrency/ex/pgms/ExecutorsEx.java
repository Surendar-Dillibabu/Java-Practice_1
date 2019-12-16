package main.concurrency.ex.pgms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsEx {

  public static void main(String[] args) {
    ExecutorService threadPool = Executors.newFixedThreadPool(1);
    // this thread will be killed and replaced
    threadPool.execute(new Task());
    // this thread will catch and handle the exception and run the following task
    threadPool.submit(new Task());
    threadPool.submit(new Task());
  }

  private static class Task implements Runnable {
    @Override
    public void run() {
      // this should print out the same thread ids even though the task threw
      System.out.println(Thread.currentThread().getId());
      throw new RuntimeException();
    }
  }
}

package main.thread.ex.pgms;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumOfNumbers implements Callable<Object> {

  private String name;
  private int num;

  SumOfNumbers(final String name, final int num) {
    this.name = name;
    this.num = num;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
  public Object call() throws Exception {
    System.out.println("Started " + this.name + " thread. Thread name :" + Thread.currentThread().getName());    
    int sum = 0;
    for (int lp1 = 1; lp1 < num; lp1++) {
      sum += lp1;
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("InterruptedException catch block");
    }
    return sum;
  }
}

public class CallableEx {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = Executors.newFixedThreadPool(4);
    SumOfNumbers[] objArr = { new SumOfNumbers("Surendar", 10), new SumOfNumbers("Vivek.B", 5),
        new SumOfNumbers("Arun", 20), new SumOfNumbers("Vivek.A", 25), new SumOfNumbers("Vasugi", 30),
        new SumOfNumbers("Sushmanth", 6) };
    for (SumOfNumbers obj : objArr) {
      Future<Object> f = service.submit(obj);
      System.out.println("Sum of first " + obj.getNum() + " numbers is " + f.get());
    }
    service.shutdown();
    System.out.println("Main thread completed");
  }
}

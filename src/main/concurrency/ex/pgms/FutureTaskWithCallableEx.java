package main.concurrency.ex.pgms;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskWithCallableEx {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    SumOfNumbers[] sumOfNumObjArr = { new SumOfNumbers("Thread-1", 5), new SumOfNumbers("Thread-2", 15),
        new SumOfNumbers("Thread-3", 10), new SumOfNumbers("Thread-4", 20), new SumOfNumbers("Thread-5", 11),
        new SumOfNumbers("Thread-6", 8), new SumOfNumbers("Thread-7", 30), new SumOfNumbers("Thread-8", 26),
        new SumOfNumbers("Thread-9", 50), new SumOfNumbers("Thread-10", 100) };
    FutureTask<Integer>[] f = new FutureTask[10];
    ExecutorService service = Executors.newFixedThreadPool(5);
    for (int lp1 = 0; lp1 < sumOfNumObjArr.length; lp1++) {
      f[lp1] = new FutureTask<Integer>(sumOfNumObjArr[lp1]);
      service.submit(f[lp1]);
    }
    service.shutdown();
    for (int lp1 = 0; lp1 < sumOfNumObjArr.length; lp1++) {
      Integer sum = f[lp1].get();
      System.out.println(sumOfNumObjArr[lp1].getThreadName() + " completed. Sum of numbers of "
          + sumOfNumObjArr[lp1].getNum() + " is :" + sum);
    }
    System.out.println("Main thread completed");
  }
}

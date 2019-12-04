package main.thread.ex.pgms;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * In this example if you see it is not executing as like thread. Since Callable
 * is not a thread. Callable will be used in multithreaded enviornment to get
 * some processed value. Here even though we are creating the Thread pool of 5
 * it won't execute the thread with 5. Since we have called the get method of
 * Future object it will block the next thread to enter into the callable. So,
 * here it will execute one by one only. If you comment out the sys.out then you
 * can see it ill call the Callable with 5 threads first. Once 5 threads
 * completes its execution next number of 5 threads will get executed
 * 
 * We can't avoid it since we have to get the returned value. So, the executor
 * pool service is created with 5 thread objects but it is executing as per
 * sequence because of get() method blocking terminology. For this purpose only
 * we have to go with FutureTask approach. Which can be used to store the
 * Callable object reference and get the returned value using FutureTask class
 * object
 * 
 * @author Surendar
 *
 */
public class CallableEx {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    SumOfNumbers[] sumOfNumObjArr = { new SumOfNumbers("Thread-1", 5), new SumOfNumbers("Thread-2", 15),
        new SumOfNumbers("Thread-3", 10), new SumOfNumbers("Thread-4", 20), new SumOfNumbers("Thread-5", 11),
        new SumOfNumbers("Thread-6", 8), new SumOfNumbers("Thread-7", 30) };
    ExecutorService es = Executors.newFixedThreadPool(5);
    for (SumOfNumbers obj : sumOfNumObjArr) {
      Future<Integer> f = es.submit(obj);
      System.out.println(obj.getThreadName() + " completed. Sum of numbers of " + obj.getNum() + " is :" + f.get());
    }
    es.shutdown();
    // Once pool is shut downed you can't initiate next callable. If you try to do
    // so, then it will throw java.util.concurrent.RejectedExecutionException
    // es.submit(sumOfNumObjArr[0]);
    System.out.println("Main thread completed");
  }
}

package main.concurrency.ex.pgms;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsInvokeAllEx {

  public static void main(String[] args) {
    final ExecutorService pool = Executors.newFixedThreadPool(2);
    final List<? extends Callable<String>> callables = Arrays.asList(
        new SleepingCallable("quick", 500),
        new SleepingCallable("slow", 5000));
    try {
      for (final Future<String> future : pool.invokeAll(callables)) {
        System.out.println(future.get());
      }
    } catch (ExecutionException | InterruptedException ex) { }
    pool.shutdown();
  }
}

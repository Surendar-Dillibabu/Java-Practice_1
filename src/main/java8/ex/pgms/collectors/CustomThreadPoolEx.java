package main.java8.ex.pgms.collectors;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class CustomThreadPoolEx {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    long firstNum = 1;
    long lastNum = 1_000_000;
    List<Long> aList = LongStream.rangeClosed(firstNum, lastNum).boxed().collect(Collectors.toList());
    ForkJoinPool pool = new ForkJoinPool(4);
    Long sum = pool.submit(() -> aList.parallelStream().reduce(0L, Long::sum)).get();
    System.out.println("testing :" + sum);
  }
}

package main.java8.ex.pgms.stream;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Streams are sequential. If you run the below example you can see the stream()
 * method uses sequential steam. So, it won't create any new thread. It will use
 * the main thread to process every element one by one. You can see the timing
 * and Thread name as well to compare. Here stream() method will take 2 seconds
 * for each element to process it. But in parallelStream() method it will use
 * the main thread also it will create the multiple threads from the
 * ForkJoinPool using the commonPool. Here the commonPool will create the
 * multiple thread based on the available processors (i.e. cores). In our
 * example say my computer is having 4 cores so it will create 4 threads. But
 * already we are having one thread called main thread. So, it will create a
 * remaining 3 threads using the ForkJoinPool. You can compare the timings and
 * thread name as well to identify the above mentioned cases
 * 
 * Say we have 7 String objects to process then the parallel stream process the
 * first 4 String objects parallely using the ForkJoinPool and multi cores. Next
 * 3 String objects will be processed once the pools are back into the pool
 * again
 * 
 * @author Surendar
 *
 */
public class SequentialParallelComparison {

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Tamil");
    ls.add("Surendar");
    ls.add("Vivek");
    ls.add("Ram");
    ls.add("Vasugi");
    ls.add("Bhaskaran");
    ls.add("Sushmanth");

    System.out.println("-------\nRunning sequential\n-------");
    printList(ls.stream());

    System.out.println("Availble processors :" + Runtime.getRuntime().availableProcessors());
    System.out.println("-------\nRunning parallel\n-------");
    printList(ls.parallelStream());
  }

  public static void printList(Stream<String> stream) {
    stream.forEach(s -> {
      System.out.println(LocalTime.now() + " - value -" + s + " - Thread name -" + Thread.currentThread().getName());
      try {
        Thread.sleep(2000);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    });
  }
}

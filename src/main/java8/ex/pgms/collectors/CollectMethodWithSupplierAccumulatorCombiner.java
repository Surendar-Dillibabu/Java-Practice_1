package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class CollectMethodWithSupplierAccumulatorCombiner {

  public static void main(String[] args) {
    List<Integer> ls = Arrays.asList(10, 5, 87, 20, 6);

    // Supplier creation. Supply a container to add elements
    Supplier<AtomicInteger> supplier = AtomicInteger::new;

    // Accumulator which can be used to add the elements in the supplier provided
    // container one by one
    BiConsumer<AtomicInteger, Integer> accumulator = (AtomicInteger a, Integer b) -> {
      a.set(a.get() + b);
    };

    // In case if we run with multiple threads using parallelStream then it will
    // combine each subtasks to single task result once the subtask is completed
    BiConsumer<AtomicInteger, AtomicInteger> combiner = (AtomicInteger a, AtomicInteger b) -> {
      // This below sop statement won't come if we use stream since only one thread is
      // accessing to process the elements it won't need a combiner
      // But if we use parallelStream then the below sop statement will be called
      // since the combiner is used to combine all the subtasks results to produce the
      // single result
      // System.out.println("a :" + a.get());
      a.set(a.get() + b.get());
    };

    // Using collect method by providing supplier, accumulator and combiner
    AtomicInteger result = ls.parallelStream().collect(supplier, accumulator, combiner);
    System.out.println("result :" + result.get());

    // Using reduce method to get the result
    Optional<Integer> result1 = ls.parallelStream().reduce((a, b) -> {
      return a + b;
    });
    System.out.println("result1 :" + result1.get());
  }
}

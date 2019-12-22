package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class CollectorsSummarizingEx {

  public static void main(String[] args) {
    CollectorsSummarizingEx obj = new CollectorsSummarizingEx();
    System.out.println(
        "====================================== IntSummaryStatistics example ========================================================");
    obj.intSummaryStatisticsEx();
    System.out.println(
        "====================================== DoubleSummaryStatistics example =====================================================");
    obj.doubleSummaryStatisticsEx();
    System.out.println(
        "====================================== LongSummaryStatistics example =======================================================");
    obj.longSummaryStatisticsEx();
  }

  public void intSummaryStatisticsEx() {
    int[] numArr = { 10, 5, 87, 20, 6 };

    // by mapping to obj and using collectors summarrizingInt method
    IntSummaryStatistics intSummaryStatistics = Arrays.stream(numArr).mapToObj(Integer::valueOf)
        .collect(Collectors.summarizingInt(a -> a));
    System.out.println("intSummaryStatistics :" + intSummaryStatistics);

    // Without using mapping and directly integrating the IntSummaryStatistics using
    // supplier, accumulator and combiner
    // Internally the above method will use this logic only
    IntSummaryStatistics intSummaryStatistics1 = Arrays.stream(numArr).collect(IntSummaryStatistics::new, (a, b) -> {
      a.accept(b);
    }, null);
    System.out.println("intSummaryStatistics1 :" + intSummaryStatistics1);
  }

  public void doubleSummaryStatisticsEx() {
    double[] numArr1 = { 10.58, 54.8, 87, 20.0, 6.5, 78.50, 25 };
    DoubleSummaryStatistics doubleSummaryStatistics = Arrays.stream(numArr1).mapToObj(Double::valueOf)
        .collect(Collectors.summarizingDouble(a -> a));
    System.out.println("doubleSummaryStatistics :" + doubleSummaryStatistics);

    // Without using mapping and directly integrating the DoubleSummaryStatistics
    // using supplier, accumulator and combiner
    // Internally the above method will use this logic only
    DoubleSummaryStatistics doubleSummaryStatistics1 = Arrays.stream(numArr1).collect(DoubleSummaryStatistics::new,
        (a, b) -> {
          a.accept(b);
        }, null);
    System.out.println("doubleSummaryStatistics1 :" + doubleSummaryStatistics1);
  }

  public void longSummaryStatisticsEx() {
    long[] numArr2 = { 10l, 5l, 87l, 20l, 6l, 82, 45l };
    LongSummaryStatistics longSummaryStatistics = Arrays.stream(numArr2).mapToObj(Long::valueOf)
        .collect(Collectors.summarizingLong(a -> a));
    System.out.println("longSummaryStatistics :" + longSummaryStatistics);

    // Without using mapping and directly integrating the LongSummaryStatistics
    // using supplier, accumulator and combiner
    // Internally the above method will use this logic only
    LongSummaryStatistics longSummaryStatistics1 = Arrays.stream(numArr2).collect(LongSummaryStatistics::new,
        (a, b) -> {
          a.accept(b);
        }, null);
    System.out.println("longSummaryStatistics1 :" + longSummaryStatistics1);
  }
}

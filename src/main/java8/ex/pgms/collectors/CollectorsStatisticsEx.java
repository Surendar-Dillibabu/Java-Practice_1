package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.Stream;

public class CollectorsStatisticsEx {

  public static void main(String[] args) {
    CollectorsStatisticsEx obj = new CollectorsStatisticsEx();
    System.out.println("====================================== IntSummaryStatistics example ========================================================");
    obj.intSummaryStatisticsEx();
    System.out.println("====================================== DoubleSummaryStatistics example =====================================================");
    obj.doubleSummaryStatisticsEx();
    System.out.println("====================================== LongSummaryStatistics example =======================================================");
    obj.longSummaryStatisticsEx();
  }
  
  public void intSummaryStatisticsEx() {
    int[] numArr = { 10, 87, 15, 6, 48, 68, 43, 10, 75 };

    // IntSummaryStatistics n = Arrays.stream(numArr).collect(IntSummaryStatistics::new, (a, b) -> { a.accept(b); }, (a, b) -> a.combine(b));
    IntSummaryStatistics n = Stream.of(numArr).flatMapToInt(Arrays::stream).collect(IntSummaryStatistics::new, (a, b) -> { a.accept(b); }, (a, b) -> a.combine(b));
    System.out.println("IntSummaryStatistics :" + n);
    System.out.println("Count :" + n.getCount());
    System.out.println("Sum :" + n.getSum());
    System.out.println("Min :" + n.getMin());
    System.out.println("Average :" + n.getAverage());
    System.out.println("Max :" + n.getMax());
  }
  
  public void doubleSummaryStatisticsEx() {
    double[] numArr = { 10.5, 87.8, 15.50, 6.0, 48.5, 68.8, 43, 10.4, 75 };

    // DoubleSummaryStatistics n = Arrays.stream(numArr).collect(DoubleSummaryStatistics::new, (a, b) -> { a.accept(b); }, (a, b) -> a.combine(b));
    DoubleSummaryStatistics n = Stream.of(numArr).flatMapToDouble(Arrays::stream).collect(DoubleSummaryStatistics::new, (a, b) -> { a.accept(b); }, (a, b) -> a.combine(b));
    System.out.println("DoubleSummaryStatistics :" + n);
    System.out.println("Count :" + n.getCount());
    System.out.println("Sum :" + n.getSum());
    System.out.println("Min :" + n.getMin());
    System.out.println("Average :" + n.getAverage());
    System.out.println("Max :" + n.getMax());
  }
  
  public void longSummaryStatisticsEx() {
    long[] numArr = { 10L, 87L, 15L, 6L, 48L, 68L, 43L, 10L, 75L };

    // LongSummaryStatistics n = Arrays.stream(numArr).collect(LongSummaryStatistics::new, (a, b) -> { a.accept(b); }, (a, b) -> a.combine(b));
    LongSummaryStatistics n = Stream.of(numArr).flatMapToLong(Arrays::stream).collect(LongSummaryStatistics::new, (a, b) -> { a.accept(b); }, (a, b) -> a.combine(b));
    System.out.println("LongSummaryStatistics :" + n);
    System.out.println("Count :" + n.getCount());
    System.out.println("Sum :" + n.getSum());
    System.out.println("Min :" + n.getMin());
    System.out.println("Average :" + n.getAverage());
    System.out.println("Max :" + n.getMax());
  }
}

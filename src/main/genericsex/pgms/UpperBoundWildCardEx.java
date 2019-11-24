package main.genericsex.pgms;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCardEx {

  public static void main(String[] args) {
    List<Integer> lsInt = new ArrayList<>();
    lsInt.add(10);
    lsInt.add(8);
    lsInt.add(5);
    System.out.println("Integer sum :" + sum(lsInt));

    List<Double> lsDb = new ArrayList<>();
    lsDb.add(10.5);
    lsDb.add(15.6);
    lsDb.add(3.8);
    System.out.println("Double sum :" + sum(lsDb));

    List<Number> lsNum = new ArrayList<>();
    lsNum.add(18);
    lsNum.add(8);
    lsNum.add(5);
    System.out.println("Number sum :" + sum(lsNum));
  }

  public static Number sum(List<? extends Number> ls) {
    double sum = 0;
    for (Number n : ls) {
      sum += n.doubleValue();
    }
    return sum;
  }
}

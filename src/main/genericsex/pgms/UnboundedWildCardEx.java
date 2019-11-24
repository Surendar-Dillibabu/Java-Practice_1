package main.genericsex.pgms;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCardEx {

  public static void main(String[] args) {
    List<Integer> lsInt = new ArrayList<>();
    lsInt.add(10);
    lsInt.add(8);
    lsInt.add(5);
    System.out.println("Elements present in Integer type ArrayList");
    display(lsInt);

    List<Number> lsNum = new ArrayList<>();
    lsNum.add(18);
    lsNum.add(8);
    lsNum.add(5);
    System.out.println("Elements present in Number type ArrayList");
    display(lsNum);
  }

  public static void display(List<?> ls) {
    ls.forEach(n -> {
      System.out.println(n);
    });
  }
}

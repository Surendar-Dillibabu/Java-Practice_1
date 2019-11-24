package main.genericsex.pgms;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCardEx {

  public static void main(String[] args) {
    List<Integer> lsInt = new ArrayList<>();
    lsInt.add(10);
    lsInt.add(8);
    lsInt.add(5);
    display(lsInt);

    List<Number> lsNum = new ArrayList<>();
    lsNum.add(18);
    lsNum.add(8);
    lsNum.add(5);
    display(lsNum);
  }

  public static void display(List<? super Integer> ls) {
    ls.add(25);
    System.out.println(ls);
  }
}

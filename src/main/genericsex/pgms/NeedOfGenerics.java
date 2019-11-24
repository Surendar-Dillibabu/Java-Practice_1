package main.genericsex.pgms;

import java.util.ArrayList;
import java.util.List;

public class NeedOfGenerics {

  public static void main(String[] args) {
    List ls = new ArrayList();
    ls.add(10);
    ls.add("test"); // It won't throw any error

    Integer i = (Integer) ls.get(0);
    System.out.println("i :" + i);

    // This below line will throw ClassCastExcpeiton at runtime. Since String is
    // placed inside list which already contains Integer.
    // Runtime we don't know which element will be present. We are expecting String.
    // Integer i1 = (Integer) ls.get(1);

    // This issue can be solved using generics and while declaring itself we can
    // mention the type of objects which we are going to insert it.
    List<Integer> newLs = new ArrayList<>();
    newLs.add(10);
    newLs.add(25);

    // Now if we try to add String in the Integer list then compile time itself we
    // will get error.
    // newLs.add("test");

    // Also we don't need to type cast it since all the elements is present inside
    // the list is Intger
    Integer i3 = newLs.get(0);
    System.out.println("i3 :" + i3);
  }

}

package main.interview.pgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReverseEx {

  public static void main(String[] args) {
    long[] numArr = new long[100];
    
    for(int lp1 = 0; lp1 < numArr.length; lp1++) {
      System.out.print(Math.random()+" ");
      // numArr[lp1] = Math.round(Math.random());
    }
    
    System.out.println(Arrays.toString(numArr));
    
    ArrayListReverseEx obj = new ArrayListReverseEx();
    ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
    al.add(5);
    al.add(18);
    al.add(10);
    al.add(8);
    al.add(62);
    al.add(5);
    al.add(10);
    al.add(36);

    ArrayList<Integer> al1 = (ArrayList<Integer>) al.clone();

    System.out.println("Before reversing the ArrayList elements using ListIterator logic :" + al);

    obj.arrayListReverseByForLoop(al);

    System.out.println("After reversing the ArrayList elements using ListIterator logic :" + al);

    System.out.println("Before reversing the ArrayList elements :" + al1);

    Collections.reverse(al1);

    System.out.println("After reversing the ArrayList elements :" + al1);
  }

  public void arrayListReverseByForLoop(ArrayList<Integer> al) {
    int mid = (al.size() / 2), replacePos = (mid % 2 == 0) ? mid : (mid - 1);
    for (int lp1 = mid; lp1 < al.size(); lp1++) {
      Integer leftNum = al.get(replacePos);
      Integer rightNum = al.get(lp1);
      al.set(lp1, leftNum);
      al.set(replacePos, rightNum);
      replacePos--;
    }
  }
}

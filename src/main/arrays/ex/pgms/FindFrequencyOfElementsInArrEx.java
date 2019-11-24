package main.arrays.ex.pgms;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfElementsInArrEx {

  public static void main(String args[]) {
    int numArr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
    Map<Integer, Integer> freqCntMap = new HashMap<>();
    for (int lp1 = 0; lp1 < numArr.length; lp1++) {
      int key = numArr[lp1];
      int value = 0;
      if (freqCntMap.containsKey(key)) {
        value = freqCntMap.get(key);
        freqCntMap.put(key, (value + 1));
      } else {
        freqCntMap.put(key, (value + 1));
      }
    }

    System.out.println("Frequency of numbers :" + freqCntMap);
  }
}

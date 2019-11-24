package main.langpkg.stringex.pgms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWords {

  public static void main(String[] args) throws IOException {
    CountNumberOfWords obj = new CountNumberOfWords();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string :");
    String inputString = br.readLine();
    System.out.println("Given string is :" + inputString);
    Map<String, Integer> mp = obj.getNumberOfWordsCount(inputString);
    System.out.println("Number of words count are :" + mp);
  }

  public Map<String, Integer> getNumberOfWordsCount(final String inputString) {
    Map<String, Integer> mp = new HashMap<>();
    for (String str : inputString.split("\\s+")) {
      if (mp.containsKey(str)) {
        int count = mp.get(str);
        mp.put(str, (count + 1));
      } else {
        mp.put(str, 1);
      }
    }
    return mp;
  }
}

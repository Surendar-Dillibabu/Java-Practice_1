package main.langpkg.stringex.pgms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctCharacterCount {

  public static void main(String[] args) throws IOException {
    DistinctCharacterCount obj = new DistinctCharacterCount();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string :");
    String inputString = br.readLine();
    System.out.println("Given string is :" + inputString);
    // Using java 7
    // Map<Character, Integer> mp = obj.getDistinctCharCountUsingJava7(inputString);

    // Using java8
    Map<Character, Integer> mp = obj.getDistinctCharCountUsingJava7(inputString);
    System.out.println("Distinct characters count are :" + mp.toString());
  }

  public Map<Character, Integer> getDistinctCharCountUsingJava7(final String inputString) {
    Map<Character, Integer> mp = new HashMap<>();
    for (char c : inputString.toCharArray()) {
      if (mp.containsKey(c)) {
        int count = mp.get(c);
        mp.put(c, (count + 1));
      } else {
        mp.put(c, 1);
      }
    }
    return mp;
  }

  public Map<Character, Integer> getDistinctCharCountUsingJava8(final String inputString) {
    Map<Character, Integer> mp = new HashMap<>();
    // Using for-loop and map merge of java 8
    /*
    for (char c : inputString.toCharArray()) {
      mp.merge(c, 1, Integer::sum);
    }
    */

    // without using for-loop but using stream and map merge
    List<Character> ls = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    ls.forEach(c -> mp.merge(c, 1, Integer::sum));
    return mp;
  }
}

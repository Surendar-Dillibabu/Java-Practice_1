package main.reg.exp.pgms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx {

  public static void main(String[] args) {
    Pattern p = Pattern.compile("ab");
    Matcher m = p.matcher("abbabbba");
    int count = 0;
    while (m.find()) {
      System.out.println("Index start position :" + m.start()+" end position :"+m.end()+" pattern :"+m.group());
      count++;
    }
    System.out.println("No of occurences of pattern :" + count);
  }
}

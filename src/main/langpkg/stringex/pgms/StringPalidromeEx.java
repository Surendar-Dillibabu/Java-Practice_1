package main.langpkg.stringex.pgms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalidromeEx {

  public static void main(String[] args) throws IOException {
    StringPalidromeEx obj = new StringPalidromeEx();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string :");
    String inputString = br.readLine();
    System.out.println("Given string is :" + inputString);
    // obj.palidromeUsingReverseConcept(inputString);
    obj.palidromeUsingCharAt(inputString);
  }

  public void palidromeUsingReverseConcept(final String inputString) {
    StringBuilder reversedString = new StringBuilder(inputString);
    System.out.println("The given string is "
        + (inputString.equals(reversedString.reverse().toString()) ? "palindrome" : "not a palindrome"));
  }

  public void palidromeUsingCharAt(final String inputString) {
    boolean isPalindrome = true;
    for (int lp1 = 0; lp1 < inputString.length() / 2; lp1++) {
      if (inputString.charAt(lp1) != inputString.charAt(inputString.length() - 1 - lp1)) {
        isPalindrome = false;
        break;
      }
    }
    System.out.println("The given string is " + (isPalindrome ? "palindrome" : "not a palindrome"));
  }
}

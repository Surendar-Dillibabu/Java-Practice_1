package main.langpkg.stringex.pgms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

  public static void main(String[] args) throws IOException {
    ReverseString obj = new ReverseString();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string :");
    String inputString = br.readLine();
    System.out.println("Given string is :" + inputString);
    // System.out.println("Reversed string is :"+obj.reverseUsingCharAt(inputString));
    // System.out.println("Reversed string is :"+obj.reverseUsingToCharArray(inputString));
    System.out.println("Reversed string is :"+obj.reverseUsingStringBuilder(inputString));
  }
  
  public String reverseUsingCharAt(final String inputString) {
    String reversedString = ""; 
    for(int lp1 = inputString.length() - 1; lp1 >= 0 ; lp1--) {
      reversedString += inputString.charAt(lp1);
    }
    return reversedString;
  }
  
  public String reverseUsingToCharArray(final String inputString) {
    String reversedString = "";
    char[] cArr = inputString.toCharArray();
    for(int lp1 = cArr.length - 1; lp1 >= 0 ; lp1--) {
      reversedString += cArr[lp1];
    }
    return reversedString;
  }
  
  public String reverseUsingStringBuilder(final String inputString) {
    StringBuilder reversedString = new StringBuilder(inputString);
    return reversedString.reverse().toString();
  }
}

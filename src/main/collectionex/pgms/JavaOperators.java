package main.collectionex.pgms;


public class JavaOperators {

  public static void main(String[] args) {    
    int num = -8;
    System.out.println(Integer.toBinaryString(num));
    int signedRightResult =  (num >> 2);
    System.out.println(Integer.toBinaryString(signedRightResult));
    int unSignedRightResult =  (num >>> 2);
    System.out.println(Integer.toBinaryString(unSignedRightResult));
    System.out.println(Integer.toBinaryString(0x7fffffff));
    System.out.println(Integer.parseInt("11000", 2));
  }
}

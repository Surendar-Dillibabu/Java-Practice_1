package main.collectionex.pgms;


public class ComparableExWithString {

  public static void main(String[] args) {
    System.out.println("A".compareTo("Z")); // -ve - Since A is less than Z when compared with alphabetical order
    System.out.println("Z".compareTo("A")); // +ve
    System.out.println("A".compareTo("A")); // 0
    System.out.println("A".compareTo(null)); // NullPointerException
  }
}

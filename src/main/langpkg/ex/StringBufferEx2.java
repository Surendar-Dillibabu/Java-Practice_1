package main.langpkg.ex;

/**
 * StringBuffer one-argument constructor with required string content as param
 * constructor will create the object with the content and create the capacity as mentioned string.length() + 16.
 * (Ex - String length is 7. Capacity = 7 + 16 = 23). Once we add or append the 24th character it will create a new
 * object with new capacity using the below formula and add the value and
 * re-assign the reference with new created StringBuffer object. new_capacity =
 * (current_capacity + 1) * 2;
 * 
 * @author Surendar
 *
 */
public class StringBufferEx2 {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("TESTING");
    System.out.println("Length :" + sb.length() + ", Capacity :" + sb.capacity()); // Length :7, Capacity :23
    sb.append("abcsdfsdfdfdfsbft");
    System.out.println("Length :" + sb.length() + ", Capacity :" + sb.capacity()); // Length : 24, Capacity :48
  }
}

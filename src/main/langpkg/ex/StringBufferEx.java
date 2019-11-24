package main.langpkg.ex;

/**
 * StringBuffer default constructor will create the object with capacity as 16.
 * Once we add or append the 17th character it will create a new object with new
 * capacity using the below formula and add the value and re-assign the
 * reference with new created StringBuffer object. new_capacity =
 * (current_capacity + 1) * 2
 * 
 * @author Surendar
 *
 */
public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    System.out.println("Length :" + sb.length() + ", Capacity :" + sb.capacity()); // Length : 0, Capacity :16
    sb.append("abcsdfsdfdfdfsbf");
    System.out.println("Length :" + sb.length() + ", Capacity :" + sb.capacity()); // Length : 16, Capacity :16
    sb.append("a"); // adding 17th character
    System.out.println("Length :" + sb.length() + ", Capacity :" + sb.capacity()); // Length : 17, Capacity :34
  }
}

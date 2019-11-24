package main.langpkg.ex;

/**
 * StringBuffer one-argument constructor with required capacity as param
 * constructor will create the object with capacity as mentioned passed capacity
 * (Ex - 20). Once we add or append the 21th character it will create a new
 * object with new capacity using the below formula and add the value and
 * re-assign the reference with new created StringBuffer object. new_capacity =
 * (current_capacity + 1) * 2;
 * 
 * @author Surendar
 *
 */
public class StringBufferEx1 {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer(20);
    System.out.println("Length :" + sb.length() + ", Capacity :" + sb.capacity()); // Length : 0, Capacity :20
    sb.append("abcsdfsdfdfdfsbftrff");
    System.out.println("Length :" + sb.length() + ", Capacity :" + sb.capacity()); // Length : 20, Capacity :20
    sb.append("a"); // adding 17th character
    System.out.println("Length :" + sb.length() + ", Capacity :" + sb.capacity()); // Length : 21, Capacity :42
  }
}

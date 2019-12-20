package main.langpkg.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Check the below code after compile in command prompt with the below command.
 * Then you can see the invokespecial, invokevirtual, invokeinterface etc
 * javap -c main.langpkg.ex.InvokeExamples
 * @author Surendar
 *
 */
public class InvokeExamples {

  public static void main(String[] args) {
    InvokeExamples sc = new InvokeExamples();
    sc.run();
  }

  public void run() {
    List<String> ls = new ArrayList<>();
    ls.add("Good Day");

    ArrayList<String> als = new ArrayList<>();
    als.add("Dydh Da");
  }
}

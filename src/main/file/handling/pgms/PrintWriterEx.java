package main.file.handling.pgms;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Using print writer we can any primitive type values. Also we don't need to
 * use separate method for adding newline.
 * 
 * @author Surendar
 *
 */
public class PrintWriterEx {

  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter("G:\\text-file.txt");
    pw.println("This is text file"); // write string types
    pw.println("The file has been written using PrintWriter object");
    pw.println(100); // write int data type
    pw.println(100.5); // write double or float data type
    pw.println(true);
    char[] c = { 'a', 'b', 'c' };
    pw.println(c); // writing array of char values
    pw.flush();
    pw.close();
    System.out.println("Print writer is completed writing in the specified file");
  }
}

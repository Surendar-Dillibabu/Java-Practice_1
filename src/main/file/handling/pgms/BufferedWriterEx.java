package main.file.handling.pgms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * In FileWriter it is programming responsibility to add new line using
 * character (i.e \n). So, if we use the program in other systems or OS we have
 * to add the line separator based on the OS. But in BufferedWriter we have a
 * method to add new line (br.newLine()) using that method we can add new line.
 * For different OS we don't need to worry anything the method will handle the
 * line separator based on OS.
 * 
 * @author Surendar
 *
 */
public class BufferedWriterEx {

  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("G:\\text-file.txt");
    BufferedWriter br = new BufferedWriter(fw);
    br.write("This is text file \n"); // write string types
    br.write("The file has been written using BufferedWriter object");
    br.newLine(); // adding new line
    br.write(100); // write int data type as char value (i.e. 100 char value as per unicode is d)
    br.newLine();
    char[] c = { 'a', 'b', 'c' };
    br.write(c); // writing array of char values
    br.newLine();
    br.flush();
    br.close();
    System.out.println("Buffered writer is completed writing in the specified file");
  }
}

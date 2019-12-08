package main.bytes.stream.pgms;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * DataInputStream mainly for reading the data from the file which has been
 * written using DataOutputStream Because it is used for storing primitive data
 * types values in a machine independent way So, internally if you read the
 * value using readInt then it will use 4 bytes (which is java memory allocation
 * size for int data type) to read the value. So, internally the readInt method
 * will call the read method four times and then it will check if any of the
 * four read values is lesser than 0 then it will throw EOFException (End Of
 * File Exception). Because while writing int using writeInt as well it
 * internally calls the write method four times depends on the java data type
 * size allocation
 * 
 * @author Surendar
 *
 */
public class DataInputStreamEx {

  public static void main(String[] args) throws IOException {
    try (DataInputStream dis = new DataInputStream(
        new FileInputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\datastream.ex"))) {
      int data = 0;
      while ((data = dis.readInt()) != -1) {
        System.out.print(data + " ");
      }
      System.out.println();
    } catch (EOFException ex) {
      System.out.println();
      System.out.println("EOFException caught");
    }
    System.out.println("File reading using DataInputStream is completed");
  }
}

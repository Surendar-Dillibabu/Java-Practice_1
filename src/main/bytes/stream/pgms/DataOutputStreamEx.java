package main.bytes.stream.pgms;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStream mainly for writing the data to the file which has been read
 * using DataInputStream. Because it is used for storing primitive data types
 * values in a machine independent way So, internally if you write the value
 * using writeInt then it will use 4 bytes (which is java memory allocation size
 * for int data type) to write the value. So, internally the writeInt method
 * will call the write method four times. While reading using DataInputStream
 * also it has to use same flow only. So, while writing if we have used writInt
 * then while reading we have to use readInt and then it will call read method
 * internally four times to get the complete int value then it will check if any
 * of the four written values is lesser than 0 then it will throw EOFException
 * (End Of File Exception).
 * 
 * @author Surendar
 *
 */
public class DataOutputStreamEx {

  public static void main(String[] args) throws IOException {
    try (DataOutputStream dos = new DataOutputStream(
        new FileOutputStream("G://Photon workspace//Java-projects//Practice_1//files//datastream.ex"))) {
      dos.writeInt(65);
      dos.writeInt(78);
    }
    System.out.println("Data output stream writting completed");
  }
}

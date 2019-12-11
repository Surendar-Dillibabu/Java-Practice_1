package main.bytes.stream.pgms;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    try (
        FileOutputStream fos1 = new FileOutputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\bos.ex1");
        FileOutputStream fos2 = new FileOutputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\bos.ex2");
        ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
      String msg = "Byte array output steam example with writing byte array into multiple file";
      byte[] bArr = msg.getBytes();
      bos.write(bArr);
      bos.writeTo(fos1);
      bos.writeTo(fos2);
    }
    System.out.println("Byte array output stream completed writing the data to multiple file");
  }
}

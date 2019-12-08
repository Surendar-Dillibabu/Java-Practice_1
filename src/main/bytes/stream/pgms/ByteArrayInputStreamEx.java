package main.bytes.stream.pgms;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteArrayInputStreamEx {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    byte[] buf = { 35, 36, 37, 38, 127 };
    try (ByteArrayInputStream bis = new ByteArrayInputStream(buf)) {
      int ch = 0;
      while ((ch = bis.read()) != -1) {
        System.out.println((char) ch);
      }
    }
    System.out.println("Byte array input stream completed reading data as stream from the byte array");
  }
}

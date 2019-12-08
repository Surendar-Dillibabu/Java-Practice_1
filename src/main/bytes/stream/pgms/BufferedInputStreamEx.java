package main.bytes.stream.pgms;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {

  public static void main(String[] args) throws IOException {
    try (FileInputStream fis = new FileInputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\fis.ex");
        BufferedInputStream bis = new BufferedInputStream(fis)) {
      byte[] bArr = new byte[bis.available()];
      bis.read(bArr);
      System.out.println(new String(bArr));
    }
    System.out.println("Buffered input stream reading data from the file is completed");
  }
}

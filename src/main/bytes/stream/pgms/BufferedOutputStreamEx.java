package main.bytes.stream.pgms;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

  public static void main(String[] args) throws IOException {
    try (FileOutputStream fos = new FileOutputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\fis.ex");
        BufferedOutputStream bos = new BufferedOutputStream(fos)) {
      String msg = "Buffered output steam example with writing byte array";
      byte[] bArr = msg.getBytes();
      bos.write(bArr);
      bos.flush();
    }
    System.out.println("Buffered output stream written data into the file");
  }
}

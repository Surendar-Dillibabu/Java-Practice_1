package main.bytes.stream.pgms;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamEx {

  public static void main(String[] args) throws IOException {
    try (InputStream is1 = new FileInputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\fis-1.ex");
        InputStream is2 = new FileInputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\fis-2.ex");
        SequenceInputStream sis = new SequenceInputStream(is1, is2);) {
      int ch = 0;
      while ((ch = sis.read()) != -1) {
        System.out.print((char) ch);
      }
    }
    System.out.println();
    System.out.println("Sequence input steam readed data from two files");
  }
}

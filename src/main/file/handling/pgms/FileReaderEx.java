package main.file.handling.pgms;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("G:\\text-file.txt");
    int c = fr.read();
    while (c != -1) {
      System.out.print((char) c);
      c = fr.read();
    }
    fr.close();
    System.out.println("File reader completed reading data in the specified file");
  }
}

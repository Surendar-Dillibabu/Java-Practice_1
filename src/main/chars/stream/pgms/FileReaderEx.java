package main.chars.stream.pgms;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\filewriter.ex");
    int data = 0;
    while ((data = fr.read()) != -1) {
      System.out.print((char) data);
    }
    fr.close();
    System.out.println();
    System.out.println("File reading using FileReader is completed");
  }
}

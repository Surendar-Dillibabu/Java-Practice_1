package main.chars.stream.pgms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
        new FileReader("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\bufferd-writer.ex"));
    int data = 0;
    while ((data = br.read()) != -1) {
      System.out.print((char) data);
    }
    br.close();
    System.out.println();
    System.out.println("File reading using BufferedReader is completed");
  }
}

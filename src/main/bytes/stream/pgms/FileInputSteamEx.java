package main.bytes.stream.pgms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputSteamEx {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream(
        new File("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\fis-1.ex"));
    int data = 0;
    while ((data = fis.read()) != -1) {
      System.out.print((char) data);
    }
    System.out.println();
    fis.close();
    System.out.println("File reading completed");
  }
}

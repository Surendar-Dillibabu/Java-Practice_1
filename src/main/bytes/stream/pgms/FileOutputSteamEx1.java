package main.bytes.stream.pgms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSteamEx1 {

  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream(new File("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\fis-2.ex"));
    String msg = "File output steam example with byte[] writing";
    byte[] bArr = msg.getBytes();
    fos.write(bArr);
    fos.close();
    System.out.println("File writing completed");
  }
}

package main.bytes.stream.pgms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputSteamEx1 {

  public static void main(String[] args) throws IOException {
    File f = new File("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\fis-2.ex");
    try (FileInputStream fis = new FileInputStream(f)) {
      byte[] bArr = new byte[(int) f.length()];
      fis.read(bArr);
      System.out.println(new String(bArr));
    }
    System.out.println("File reading completed");
  }
}

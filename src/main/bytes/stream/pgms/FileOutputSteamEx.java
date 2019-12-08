package main.bytes.stream.pgms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Stream is preferred while process the data as like raw bytes
 * 
 * @author Surendar
 *
 */
public class FileOutputSteamEx {

  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream(
        new File("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\fis-1.ex"));
    String msg = "File output steam example with writing -1 one by one byte \n with the new line concept";
    byte[] bArr = msg.getBytes();
    for (byte b : bArr) {
      fos.write(b);
    }
    fos.close();
    System.out.println("File writing completed");
  }
}

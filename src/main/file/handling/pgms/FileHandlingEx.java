package main.file.handling.pgms;

import java.io.File;
import java.io.IOException;

public class FileHandlingEx {

  public static void main(String[] args) throws IOException {
    File f = new File("G:\\test-file.txt");
    System.out.println("File exist :"+f.exists());
    if(!f.exists()) {
      f.createNewFile();
    }
    System.out.println("File exist :"+f.exists());
  }
}

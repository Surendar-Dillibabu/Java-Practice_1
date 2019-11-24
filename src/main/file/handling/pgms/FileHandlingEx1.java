package main.file.handling.pgms;

import java.io.File;
import java.io.IOException;

public class FileHandlingEx1 {

  public static void main(String[] args) throws IOException {
    File f = new File("G:\\File-handling");
    if (!f.exists()) {
      f.mkdir();
      System.out.println("Folder created");
    }
    // Both the below cases it will create a file inside the folder
    // File f1 = new File("G:\\File-handling", "text-file.txt");
    File f1 = new File(f, "text-file.txt");
    if (!f1.exists()) {
      f1.createNewFile();
      System.out.println("File created");
    } else {
      System.out.println("File already present");
    }
  }
}

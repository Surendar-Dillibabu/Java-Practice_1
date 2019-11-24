package main.file.handling.pgms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

  public static void main(String[] args) throws IOException {
    File f = new File("G:\\text-file.txt");
    char[] cArr = new char[(int) f.length()];
    FileReader fr = new FileReader("G:\\text-file.txt");
    fr.read(cArr);
    for (char c : cArr) {
      System.out.print(c);
    }
    fr.close();
    System.out.println("File reader completed reading data in the specified file");
  }
}

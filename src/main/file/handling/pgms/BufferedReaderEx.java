package main.file.handling.pgms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("G:\\text-file.txt");
    BufferedReader br = new BufferedReader(fr);
    String data = br.readLine();
    while (data != null) {
      System.out.println(data);
      data = br.readLine();
    }
    br.close();
    System.out.println("Buffered reader completed reading data in the specified file");
  }
}

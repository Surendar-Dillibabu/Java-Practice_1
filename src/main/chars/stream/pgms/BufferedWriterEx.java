package main.chars.stream.pgms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(
        new FileWriter("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\bufferd-writer.ex"));
    bw.write("Writting data into the file using BufferedWriter");
    bw.close();
    System.out.println("File writing using BufferedWriter is completed");
  }
}

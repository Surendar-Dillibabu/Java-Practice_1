package main.chars.stream.pgms;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Writer is preferred while processing text
 * 
 * @author Surendar
 *
 */
public class FileWriterEx {

  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\filewriter.ex");
    fw.write("File writer example program");
    fw.close();
    System.out.println("File writting using FileWriter is completed");
  }
}

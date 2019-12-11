package main.chars.stream.pgms;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

  private static final String FILE_PATH = "G:\\Photon workspace\\Java-projects\\Practice_1\\files\\random-access.ex";

  public static void main(String[] args) throws IOException {
    RandomAccessFileEx obj = new RandomAccessFileEx();
    obj.writeToFile(FILE_PATH, "File writing example using RandomAccessFile", 0);
    obj.readFromFile(FILE_PATH, 0, 30);
  }

  public void writeToFile(String filePath, String data, int position) throws IOException {
    RandomAccessFile rf = new RandomAccessFile(filePath, "rw");
    // set the file pointer position to start read or write
    rf.seek(position);
    rf.write(data.getBytes());
    rf.close();
    System.out.println("File writing hs been completed");
  }

  public void readFromFile(String filePath, int position, int size) throws IOException {
    RandomAccessFile rf = new RandomAccessFile(filePath, "r");
    byte[] bArr = new byte[size];
    // set the file pointer position to start read or write
    rf.seek(position);
    rf.read(bArr);
    for (byte b : bArr) {
      System.out.print((char) b);
    }
    System.out.println();
    rf.close();
    System.out.println("File reading has been completed");
  }
}

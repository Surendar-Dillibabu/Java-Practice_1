package main.nio.ex.pgms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class BasicChannelEx {
  public static void main(String args[]) throws IOException {
    // Path of Input text file
    try (
        FileInputStream input = new FileInputStream(
            "G:\\Photon workspace\\Java-projects\\Practice_1\\files\\filechannel-src.txt");
        ReadableByteChannel source = input.getChannel();
        FileOutputStream output = new FileOutputStream(
            "G:\\Photon workspace\\Java-projects\\Practice_1\\files\\filechannel-dest.txt");
        WritableByteChannel destination = output.getChannel();) {
      copyData(source, destination);
    }
    System.out.println("File writing has been completed");
  }

  private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
    ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
    while (src.read(buffer) != -1) {
      // The buffer is used to drained
      buffer.flip();
      // keep sure that buffer was fully drained
      while (buffer.hasRemaining()) {
        dest.write(buffer);
      }
      buffer.clear(); // Now the buffer is empty, ready for the filling
    }
}
}

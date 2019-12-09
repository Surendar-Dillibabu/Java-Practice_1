package main.nio.ex.pgms;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {

  public static void main(String[] args) throws IOException {
    FileChannelDemo obj = new FileChannelDemo();
    Persistable p = new Tablet("Apple", 50000, true);
    String virtualFileLocation = "tablet.store";
    obj.writeDataToFile(virtualFileLocation, p);

    Persistable p1 = new Tablet();
    obj.readDataFromFile(virtualFileLocation, p1);
    System.out.println("Readed object from the file channel :" + p1);
  }

  public void writeDataToFile(String virtualFileLocation, Persistable p) throws IOException {
    RandomAccessFile rf = new RandomAccessFile(virtualFileLocation, "rw");
    FileChannel fc = rf.getChannel();
    ByteBuffer bBuf = ByteBuffer.allocateDirect(1024);

    // writing object data to the buffer
    p.writeData(bBuf);

    // fliping the buffer since while writing from object it came to the position of
    // last written value. So, flip method will be used to flip the position to zero
    bBuf.flip();

    // writing data to the file channel
    int numberOfBytesWritten = fc.write(bBuf);

    System.out.println("Number of bytes written through FileChanel :" + numberOfBytesWritten);

    fc.close();
    rf.close();
  }

  public void readDataFromFile(String virtualFileLocation, Persistable p) throws IOException {
    RandomAccessFile rf = new RandomAccessFile(virtualFileLocation, "r");
    FileChannel fc = rf.getChannel();
    ByteBuffer bBuf = ByteBuffer.allocate(1024);

    // reading data from file channel and writing into the buffer
    int numberOfBytesReaded = fc.read(bBuf);

    System.out.println("Number of bytes readed through FileChanel :" + numberOfBytesReaded);

    // fliping the buffer since while writing from FileChannel it came to the
    // position of last written value. So, flip method will be used to flip the
    // position to zero
    bBuf.flip();

    // reading the data from the buffer and update the object
    p.readData(bBuf);

    fc.close();
    rf.close();
  }
}

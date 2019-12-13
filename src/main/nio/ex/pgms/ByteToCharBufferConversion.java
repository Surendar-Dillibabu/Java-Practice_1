package main.nio.ex.pgms;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ByteToCharBufferConversion {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\files\\filewriter.ex");
    FileChannel fc = fis.getChannel();
    ByteBuffer bBuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
    Charset cs = Charset.defaultCharset();
    CharsetDecoder cd = cs.newDecoder();
    CharBuffer cBuf = cd.decode(bBuf);
    fc.close();
    fis.close();
    System.out.println("Data :" + cBuf.toString());
  }
}

package main.nio.ex.pgms;

import java.nio.ByteBuffer;

public interface Persistable {

  public void writeData(ByteBuffer buffer);

  public void readData(ByteBuffer buffer);
}

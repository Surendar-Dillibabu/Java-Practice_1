package main.nio.ex.pgms;

import java.nio.ByteBuffer;

public interface Persistable {

  public void persist(ByteBuffer buffer);

  public void recover(ByteBuffer buffer);

}

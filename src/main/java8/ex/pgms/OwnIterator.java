package main.java8.ex.pgms;

import java.util.Iterator;

public class OwnIterator {

  private class PrimitiveByteIterator implements Iterator<Byte> {

    private byte[] b = null;
    private int cursor = 0;

    PrimitiveByteIterator(byte[] b2) {
      this.b = b2;
    }

    @Override
    public boolean hasNext() {
      return cursor < b.length;
    }

    @Override
    public Byte next() {
      return b[cursor++];
    }

  }

  public static void main(String[] args) {
    byte[] b = { 1, 10, 15, 3, 6, 78 };

    OwnIterator.PrimitiveByteIterator iter = new OwnIterator().new PrimitiveByteIterator(b);

    System.out.println("Elements present in the byte array");
    iter.forEachRemaining(System.out::println);
  }
}

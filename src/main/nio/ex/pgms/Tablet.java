package main.nio.ex.pgms;

import java.nio.ByteBuffer;

public class Tablet implements Persistable {

  private String brand;
  private long price;
  private boolean isCellular;

  Tablet() {
  }

  Tablet(String brand, long price, boolean isCellular) {
    this.brand = brand;
    this.price = price;
    this.isCellular = isCellular;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public boolean isCellular() {
    return isCellular;
  }

  public void setCellular(boolean isCellular) {
    this.isCellular = isCellular;
  }

  @Override
  public String toString() {
    return "Tablet [brand=" + brand + ", price=" + price + ", isCellular=" + isCellular + "]";
  }

  @Override
  public void writeData(ByteBuffer buffer) {
    byte[] b = brand.getBytes();
    buffer.putInt(b.length);
    buffer.put(b, 0, b.length);
    buffer.putLong(price);
    buffer.put((byte) (isCellular ? 0 : 1));
  }

  @Override
  public void readData(ByteBuffer buffer) {
    int bLength = buffer.getInt();
    byte[] brandArr = new byte[bLength];
    buffer.get(brandArr, 0, bLength);
    this.brand = new String(brandArr);
    this.price = buffer.getLong();
    this.isCellular = (buffer.get() == 0 ? true : false);
  }
}

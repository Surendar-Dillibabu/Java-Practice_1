package main.serializable.pgms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationInSingleton {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    College c = College.INSTANCE;
    College c1 = null;
    c.setCollegeId(100);
    c.setCollegeName("Anna university");

    try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("G:\\Photon workspace\\Practice_1\\singletonex.ser"))) {
      oos.writeObject(c);
      System.out.println("Serialization completed");
    }
    c.setCollegeId(200);

    System.out.println("c object value :" + c);

    try (ObjectInputStream oos = new ObjectInputStream(
        new FileInputStream("G:\\Photon workspace\\Practice_1\\singletonex.ser"))) {
      c1 = (College) oos.readObject();
      System.out.println("Deserialization completed");
    }

    System.out.println("c1 object value :" + c1);

    if (c.equals(c1)) {
      System.out.println("Both objects are same");
    } else {
      System.out.println("Both objects are not same");
    }
  }
}

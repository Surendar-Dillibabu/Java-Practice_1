package main.serializable.pgms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerializationEx {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    UserDetails userDetails1 = new UserDetails(100, "Surendar", "admin");

    try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("G:\\Photon workspace\\Practice_1\\customized-ser-ex.ser"))) {
      oos.writeObject(userDetails1);
      System.out.println("Serialization completed");
    }

    try (ObjectInputStream oos = new ObjectInputStream(
        new FileInputStream("G:\\Photon workspace\\Practice_1\\customized-ser-ex.ser"))) {
      UserDetails userDetails2 = (UserDetails) oos.readObject();
      System.out.println(userDetails2);
      System.out.println("Deserialization completed");
    }
  }
}

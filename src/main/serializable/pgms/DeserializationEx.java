package main.serializable.pgms;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream("G:\\Photon workspace\\Practice_1\\serialization-ex.ser");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Student s1 = (Student) ois.readObject();
    ois.close();
    System.out.println("Student details :" + s1);
    System.out.println("Deserializing object from file operation has been completed");
  }
}

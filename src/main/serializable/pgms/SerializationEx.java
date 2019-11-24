package main.serializable.pgms;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

  public static void main(String[] args) throws IOException {
    // If department object is not serialized then we will get
    // NotSerializableException
    // Since department object reference present in Student class then department
    // class also must implement Serailizable in order to achieve serialization
    Department d1 = new Department(100, "CSE");
    Student s1 = new Student(1, "Surendar", 27, 9413332132L, d1);
    FileOutputStream fos = new FileOutputStream("G:\\Photon workspace\\Practice_1\\serialization-ex.ser");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(s1);
    oos.close();
    System.out.println("Serializing object into file operation has been completed");
  }
}

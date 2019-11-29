package main.serializable.pgms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * In this example if you the parent class is not serialized but the child class
 * is serialized. If we serialize and deserialize the child class object then
 * automatically through constructor chaining the corresponding parent class
 * constructor will be called. So, it will allocate the default values or
 * constructor initialized values Since through object
 * 
 * But if you implement Serializable interface in Parent class as well means
 * then you can see the parent class as well will get serialized So, the parent
 * class will get assigned with the updated value
 * 
 * @author Surendar
 *
 */
public class SerializationWithInheritanceEx {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Child c = new Child();

    try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\inheritance-ex.ser"))) {
      c.setParentId(25); // Here we are updating parent id as 25
      c.setChildId(35);
      oos.writeObject(c);
      System.out.println("Serialization completed");
    }

    try (ObjectInputStream oos = new ObjectInputStream(
        new FileInputStream("G:\\Photon workspace\\Java-projects\\Practice_1\\inheritance-ex.ser"))) {
      Child c1 = (Child) oos.readObject();
      System.out.println(c1);
      System.out.println("Parent id :" + c1.getParentId()); // But here we will get constructor initialized value only
      System.out.println("Deserialization completed");
    }
  }
}

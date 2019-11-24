package main.serializable.pgms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * In this example you can see we are not providing default serialVersionUID, so
 * the JVM will generate the serialVersionUID based on the structure. Now, it
 * will serialize the element with the serialVersionUID. Then if you try to
 * deserialize then you can see the propety values without any issue. But if you
 * add any more new property in the Employee class means then JVM will have
 * created new serialVersionUID based on the new structure. Now if you try to
 * deserialize means you will get InvalidClassException since while
 * deserializing JVM will check whether the serialied serialVersionUID is
 * matching with the class. If not matched then it will throw
 * InvalidClassException.
 * 
 * That's why it is always a good practice to declare our own serialVersionUID
 * without depending on JVM compiler to generate it.
 * 
 * @author Surendar
 *
 */
public class SerialVersionUIDEx {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Employee emp1 = new Employee(100, "Surendar");

    try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("G:\\Photon workspace\\Practice_1\\inheritance-ex.ser"))) {
      oos.writeObject(emp1);
      System.out.println("Serialization completed");
    }

    try (ObjectInputStream oos = new ObjectInputStream(
        new FileInputStream("G:\\Photon workspace\\Practice_1\\inheritance-ex.ser"))) {
      Employee emp2 = (Employee) oos.readObject();
      System.out.println(emp2);
      System.out.println("Deserialization completed");
    }
  }
}

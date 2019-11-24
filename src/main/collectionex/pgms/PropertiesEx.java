package main.collectionex.pgms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

  public static void main(String[] args) throws IOException {
    Properties p = new Properties();

    System.out.println("Loading the property files key-values to the java property object");
    p.load(new FileInputStream("G:\\Photon workspace\\Practice_1\\src\\main\\collectionex\\pgms\\Practice.properties"));
    System.out.println("Properties elements :" + p);
    System.out.println("password property :" + p.getProperty("password"));
    p.setProperty("password", "tiger123");

    System.out.println("Storing the java property object changes to property files");
    p.store(new FileOutputStream("G:\\Photon workspace\\Practice_1\\src\\main\\collectionex\\pgms\\Practice.properties"), "Changed for property store demo");
    System.out.println("Property store operation completed");
  }
}

package main.pgms.practices;

import java.util.Properties;

public class PrintSystemProperties {

  public static void main(String args[]) {
    // List all System properties
    Properties prop = System.getProperties();
    System.out.println(prop);

    // Get a particular System property given its key
    // Return the property value or null
    System.out.println("java.version :" + System.getProperty("java.version"));
    System.out.println("java.home :" + System.getProperty("java.home"));
    System.out.println("java.library.path :" + System.getProperty("java.library.path"));
    System.out.println("java.ext.dirs :" + System.getProperty("java.ext.dirs"));
    System.out.println("java.class.path :" + System.getProperty("java.class.path"));
  }

}

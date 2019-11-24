package main.langpkg.ex;

import java.lang.reflect.Method;

public class ObjectClsMethodList {

  public static void main(String[] args) throws ClassNotFoundException {
    Class<?> c = Class.forName("java.lang.Object");
    Method[] methodArr = c.getDeclaredMethods();
    int count = 0;
    for (Method m : methodArr) {
      count++;
      System.out.println(m.getName());
    }
    System.out.println("Number of methods :" + count);
  }
}

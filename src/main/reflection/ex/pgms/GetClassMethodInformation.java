package main.reflection.ex.pgms;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class GetClassMethodInformation {

  public static void main(String[] args) {
    Books booksObj = new Books("Java: The Complete Reference, Eleventh Edition", "Herbert Schildt", 500);
    Class<? extends Object> classObj = booksObj.getClass();
    Constructor<?>[] consArrObj = classObj.getConstructors();

    System.out.println("========================================================================");
    System.out.println("Field details");
    System.out.println("========================================================================");
    Field[] fieldArrObj = classObj.getDeclaredFields();
    for (Field fObj : fieldArrObj) {
      System.out
          .println("Name :" + fObj.getName() + ", type :" + fObj.getType());
    }
    System.out.println("\n");
    
    System.out.println("========================================================================");
    System.out.println("Constructor details");
    System.out.println("========================================================================");
    for (Constructor<?> consObj : consArrObj) {
      System.out.println("Name :" + consObj.getName() + ", paramter count :"
          + consObj.getParameterCount());
      System.out.println("Constructor paramter details");
      Parameter[] paramterArrObj = consObj.getParameters();
      for (Parameter pObj : paramterArrObj) {
        System.out
            .println("Name :" + pObj.getName() + ", type :" + pObj.getType());
      }
    }
    System.out.println("\n");

    System.out.println("========================================================================");
    System.out.println("Method details");
    System.out.println("========================================================================");
    Method[] methodArrObj = classObj.getDeclaredMethods();
    for (Method mObj : methodArrObj) {
      System.out.println("Name :" + mObj.getName() + ", paramter count :"
          + mObj.getParameterCount());
      System.out.println("Method paramter details");
      Parameter[] paramterArrObj = mObj.getParameters();
      for (Parameter pObj : paramterArrObj) {
        System.out
            .println("Name :" + pObj.getName() + ", type :" + pObj.getType());
      }
    }    
  }
}

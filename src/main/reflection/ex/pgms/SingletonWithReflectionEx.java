package main.reflection.ex.pgms;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonWithReflectionEx {

  public static void main(String[] args)
      throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    // In this below case even though it is a singleton class we are able to create
    // one more object using reflection concept
    Constructor<?>[] consArr = Singleton.class.getDeclaredConstructors();
    for (Constructor<?> cons : consArr) {
      cons.setAccessible(true);
      Singleton s = (Singleton) cons.newInstance();
      // Both singleton instance and the singgleton object created using reflection
      // will return different hash code values
      System.out.println(s.hashCode());
      System.out.println(Singleton.instance.hashCode());
    }

    // Singleton with enum. Here reflection can't be applied in enums.
    Constructor<?>[] consArr1 = SingletonEnum.INSTANCE.getClass().getDeclaredConstructors();
    for(Constructor<?> con : consArr1) {
      con.setAccessible(true);
      // Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
      // Will get this exception
      System.out.println(con.newInstance());
    }
  }
}

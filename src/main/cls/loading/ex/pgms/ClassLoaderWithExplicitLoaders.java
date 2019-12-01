package main.cls.loading.ex.pgms;

public class ClassLoaderWithExplicitLoaders {

  public static void main(String args[]) throws ClassNotFoundException {
    // printing ClassLoader of this class
    System.out.println("ClassLoaderWithExplicitLoaders.getClass().getClassLoader() : "
        + ClassLoaderWithExplicitLoaders.class.getClassLoader());

    // trying to explicitly load this class again using Extension class loader
    // Class.forName("main.cls.loading.ex.pgms.ClassLoaderWithExplicitLoaders", true, ClassLoaderWithExplicitLoaders.class.getClassLoader().getParent());    
  }

}

package main.langpkg.ex;


public class ClassInstanceEx {

  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Class<?> myClass = Class.forName("main.langpkg.ex.Student"); 
    
    // creating new instance of this class 
    // newInstance method 
    Object obj = myClass.newInstance(); 
    
    System.out.println(myClass.toString());
    
    System.out.println(obj.toString());
    
    System.out.println(myClass == obj);
      
    // returns the runtime class of obj 
    System.out.println("Class of obj : " + obj.getClass()); 
  }
}

package main.genericsex.pgms;

public class GenericClassEx2 {

  public static void main(String[] args) {
    GenericClass<String> stringGenerics = new GenericClass<String>("Generic String class");
    System.out.println(stringGenerics.getT());
    System.out.println(stringGenerics);

    GenericClass<Integer> integerGenerics = new GenericClass<Integer>(10);
    System.out.println(integerGenerics.getT());
    System.out.println(integerGenerics);

    GenericClass<Double> doubleGenerics = new GenericClass<Double>(10.5);
    System.out.println(doubleGenerics.getT());
    System.out.println(doubleGenerics);
  }
}

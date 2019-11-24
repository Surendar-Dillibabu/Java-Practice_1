package main.genericsex.pgms;

public class UsingGenericClass {

  public static void main(String[] args) {
    GenericClassEx<String, Double> gn = new GenericClassEx<>("Surendar", 10.56, 10);
    System.out.println(gn.getT());
    System.out.println(gn.getE());
    System.out.println(gn);

    // Generic parameter inside another generic parameter
    Employee<Integer, String> emp = new Employee<>(100, "Surendar");
    GenericClassEx<Employee<Integer, String>, Double> gn1 = new GenericClassEx<>(emp, 10.56, 10);
    System.out.println(gn1.getT());
    System.out.println(gn1.getE());
    System.out.println(gn1);
  }
}

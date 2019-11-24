package main.genericsex.pgms;

public class GenericsType<T> {

  public T t;

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public static void main(String args[]) {
    // No need to worry about run time error since compile time itself we will get an error if the type is not matched
    GenericsType<String> type = new GenericsType<>();
    type.setT("Pankaj"); // valid

    // This belongs to raw type. The type maybe anything maybe Object, String
    GenericsType type1 = new GenericsType(); // raw type
    type1.setT("Pankaj"); // valid
    type1.setT(10); // valid and autoboxing support
  }

}

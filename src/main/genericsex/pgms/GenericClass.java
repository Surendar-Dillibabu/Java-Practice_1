package main.genericsex.pgms;

public class GenericClass<T> {

  private T t;

  GenericClass(T t) {
    this.t = t;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  @Override
  public String toString() {
    return "GenericClass [t=" + t + ", class name :" + t.getClass().getName() + "]";
  }

}

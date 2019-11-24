package main.genericsex.pgms;

public class GenericClassEx<T, E> {

  private T t;

  private E e;

  private int a;

  public GenericClassEx(T t, E e, int a) {
    this.t = t;
    this.e = e;
    this.a = a;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public E getE() {
    return e;
  }

  public void setE(E e) {
    this.e = e;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  @Override
  public String toString() {
    return "GenericClassEx [t=" + t + ", e=" + e + ", a=" + a + "]";
  }

}

package main.genericsex.pgms;

public class Employee<E, N> {

  private E e;

  private N n;

  Employee(E e, N n) {
    this.e = e;
    this.n = n;
  }

  public E getE() {
    return e;
  }

  public void setE(E e) {
    this.e = e;
  }

  public N getN() {
    return n;
  }

  public void setN(N n) {
    this.n = n;
  }

  @Override
  public String toString() {
    return "Employee [e=" + e + ", n=" + n + "]";
  }

}

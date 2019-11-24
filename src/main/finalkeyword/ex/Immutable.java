package main.finalkeyword.ex;


public class Immutable {

  private final int value;

  public Immutable(int value) {
      this.value = value;
  }

  public int getValue() {
    System.out.println("getvalue");
      return value;
  }
}

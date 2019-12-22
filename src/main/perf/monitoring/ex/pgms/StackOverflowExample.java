package main.perf.monitoring.ex.pgms;

public class StackOverflowExample {

  public static void main(String[] args) {
    StackOverflowExample obj = new StackOverflowExample();
    obj.print();
  }

  public void print() {
    displayMessage();
  }

  public void displayMessage() {
    print();
  }
}

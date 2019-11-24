package main.thread.ex.pgms;

class NewThread2 extends Thread {

  private static final ThreadLocal<Integer> gfg = new ThreadLocal<Integer>() {

    protected Integer initialValue() {
      return new Integer(question--);
    }
  };

  private static int question = 15;

  NewThread2(String name) {
    super(name);
  }

  public void run() {
    for (int i = 0; i < 2; i++)
      System.out.println(getName() + " " + gfg.get());
  }
}

public class ThreadLocalDemo {

  public static void main(String[] args) {

    NewThread2 t1 = new NewThread2("quiz1");
    NewThread2 t2 = new NewThread2("quiz2");
    t1.start();
    t2.start();
  }
}
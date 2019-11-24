package main.thread.ex.pgms;

class ParentThread extends Thread {

  static ThreadLocal<Integer> tl = new ThreadLocal<Integer>() {

    protected Integer initialValue() {
      return 5;
    }
  };

  ParentThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Thread " + Thread.currentThread().getName() + " started. Thread local value is :" + tl.get());
    tl.set(10);
    System.out.println("Thread local after setting :" + tl.get());
    System.out.println();
    ChildThread6 ct = new ChildThread6("Child-thread");
    ct.start();
  }
}

class ChildThread6 extends Thread {

  ChildThread6(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println(
        "Thread " + Thread.currentThread().getName() + " started. Thread local value is :" + ParentThread.tl.get());
  }
}

public class ThreadLocalEx3 {

  public static void main(String[] args) {
    ParentThread p = new ParentThread("Parent-thread");
    p.start();
  }

}

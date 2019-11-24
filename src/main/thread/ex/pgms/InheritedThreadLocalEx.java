package main.thread.ex.pgms;

class ParentThread2 extends Thread {

  static InheritableThreadLocal<Integer> tl = new InheritableThreadLocal<Integer>() {

    protected Integer initialValue() {
      return 5;
    }
  };

  ParentThread2(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Thread " + Thread.currentThread().getName() + " started. Thread local value is :" + tl.get());
    tl.set(10);
    System.out.println("Thread local after setting :" + tl.get());
    System.out.println();
    ChildThread7 ct = new ChildThread7("Child-thread");
    ct.start();
  }
}

class ChildThread7 extends Thread {

  ChildThread7(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println(
        "Thread " + Thread.currentThread().getName() + " started. Thread local value is :" + ParentThread2.tl.get());
  }
}

public class InheritedThreadLocalEx {

  public static void main(String[] args) {
    ParentThread2 p = new ParentThread2("Parent-thread");
    p.start();
  }
}

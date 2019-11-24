package main.thread.ex.pgms;

class ParentThread3 extends Thread {

  static InheritableThreadLocal<Integer> tl = new InheritableThreadLocal<Integer>() {

    protected Integer childValue(Integer p) {
      return 25;
    }
  };

  ParentThread3(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Thread " + Thread.currentThread().getName() + " started. Thread local value is :" + tl.get());
    tl.set(10);
    System.out.println("Thread local after setting :" + tl.get());    
    ChildThread8 ct = new ChildThread8("Child-thread");
    ct.start();
  }
}

class ChildThread8 extends Thread {

  ChildThread8(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println(
        "Thread " + Thread.currentThread().getName() + " started. Thread local value is :" + ParentThread3.tl.get());
  }
}

public class InheritedThreadLocalEx2 {

  public static void main(String[] args) {
    ParentThread3 p = new ParentThread3("Parent-thread");
    p.start();
  }
}

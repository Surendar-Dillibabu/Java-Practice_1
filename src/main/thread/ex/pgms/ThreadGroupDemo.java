package main.thread.ex.pgms;

class NewThread extends Thread {

  NewThread(String threadname, ThreadGroup tgob) {
    super(tgob, threadname);
  }

  public void run() {

    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException ex) {
        System.out.println("Exception encounterted");
      }
    }
    System.out.println("Thread " + Thread.currentThread().getName() + " is completed");
  }
}

public class ThreadGroupDemo {

  public static void main(String arg[]) {
    // creating the thread group
    ThreadGroup gfg = new ThreadGroup("parent thread group");

    NewThread t1 = new NewThread("one", gfg);
    System.out.println("Starting one");
    t1.start();
    NewThread t2 = new NewThread("two", gfg);
    System.out.println("Starting two");
    t2.start();
    // checking the number of active thread
    System.out.println("number of active thread: " + gfg.activeCount());
  }
}
package main.thread.ex.pgms;

public class JoinDemo implements Runnable {

  public void run() {
    Thread t = Thread.currentThread();
    System.out.println("Current thread: " + t.getName());

    // checks if current thread is alive
    System.out.println("Is Alive? " + t.isAlive());

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println(t.getName()+" completes");
  }

  public static void main(String args[]) throws Exception {
    Thread t1 = new Thread(new JoinDemo(), "Thread1");
    Thread t2 = new Thread(new JoinDemo(), "Thread2");
    t1.start();

    // Waits for 1000ms this thread to die.
    t1.join(1000);

    System.out.println("Joining after 1000 mili seconds");
    System.out.println("Current thread: " + Thread.currentThread().getName());

    // Checks if this thread is alive
    System.out.println("Is alive? " + t1.isAlive());

    t2.start();

    t2.join();

    System.out.println("Joining after t2 completes its action");
    System.out.println("Current thread: " + Thread.currentThread().getName());

  }
}
package main.thread.ex.pgms;

public class ThreadGroupEx {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getThreadGroup().getName());
    System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
    
    ThreadGroup tg = new ThreadGroup("First Group"); // Default max priority is 10
    Thread t1 = new Thread(tg, "Thread1");
    Thread t2 = new Thread(tg, "Thread1");
    tg.setMaxPriority(3); // Setting default max proority to 3
    Thread t3 = new Thread(tg, "Thread1");
    System.out.println(t1.getPriority()); // 5
    System.out.println(t2.getPriority()); // 5
    System.out.println(t3.getPriority()); // 3 -- This newly created thread alone will get the priority as 3
    
    System.out.println("Thread group list");
    tg.list();
    
    System.out.println("No of active threads :"+tg.activeCount());
    System.out.println("No of active group counts :"+tg.activeGroupCount());
  }
}

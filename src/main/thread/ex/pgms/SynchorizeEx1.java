package main.thread.ex.pgms;

// class level lock example
class DisplayWish1 {
  
  public static synchronized void wish(final String name) {
    for(int lp1 = 0; lp1 < 10; lp1++) {
      System.out.print("Good morning :");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      System.out.println("InterruptedException catch block");
      }
      System.out.println(name);
    }
  }
}

class ChildThread4 extends Thread {
  DisplayWish1 d;
  String name;
  
  
  public ChildThread4(DisplayWish1 d, String name) {
   this.d = d;
   this.name = name;
  }
  
  @Override
  public void run() {
    d.wish(name);
  }
}
public class SynchorizeEx1 {

  public static void main(String[] args) {
    DisplayWish1 d = new DisplayWish1();
    DisplayWish1 d1 = new DisplayWish1();
    ChildThread4 t1 = new ChildThread4(d, "Surendar");
    ChildThread4 t2 = new ChildThread4(d1, "Deepan");
    t1.start();
    t2.start();
  }
}

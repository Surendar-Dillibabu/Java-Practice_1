package main.thread.ex.pgms;

// object level lock example
class DisplayWish {
  
  public synchronized void wish(final String name) {
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

class ChildThread3 extends Thread {
  DisplayWish d;
  String name;
  
  
  public ChildThread3(DisplayWish d, String name) {
   this.d = d;
   this.name = name;
  }
  
  @Override
  public void run() {
    d.wish(name);
  }
}
public class SynchorizeEx {

  public static void main(String[] args) {
    DisplayWish d = new DisplayWish();
    ChildThread3 t1 = new ChildThread3(d, "Surendar");
    ChildThread3 t2 = new ChildThread3(d, "Deepan");
    t1.start();
    t2.start();
  }
}

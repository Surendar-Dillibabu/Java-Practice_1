package main.thread.ex.pgms;


public class CreateThreadByExtendThreadEx extends Thread {

  @Override
  public void run() {
    for (int lp1 = 0; lp1 < 10; lp1++) {
      System.out.println("child thread");
      Thread.yield();
      /*if(lp1 >= 5) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }*/
    }
  }
  
  public static void main(String args[]) {    
    CreateThreadByExtendThreadEx obj = new CreateThreadByExtendThreadEx();
    obj.setPriority(8);
    obj.start();
    for(int lp1 = 0; lp1 < 10; lp1++) {
      System.out.println("main thread");
    }
    //System.out.println("Thread execution completed");
  }
}

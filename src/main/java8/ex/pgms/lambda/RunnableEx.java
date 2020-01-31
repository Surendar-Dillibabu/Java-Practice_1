package main.java8.ex.pgms.lambda;

public class RunnableEx {

  public static void main(String[] args) {

    /*
     * Using anonymous for having one line code logic as well we have to write 3 to
     * 5 lines of code due to java class structure
     */
    Runnable r1 = new Runnable() {

      @Override
      public void run() {
        System.out.println("Runnable run method using anonymous class");

      }
    };

    Thread t1 = new Thread(r1);
    t1.start();

    /*
     * To simplify the above boiler plate code lambda came into picture which solves
     * the unnecessary code with simple one line
     */
    Runnable r2 = () -> System.out.println("Runnable iterface run method using lambda");
    Thread t2 = new Thread(r2);
    t2.start();
  }
}

package main.jvm.related.pgms;

/**
 * Finalize method only once by the garbage collector. Now in this example the
 * object f is being nullified. Then call to the garbage collector will call the
 * finalize method. But at the end of finalize method the object f is being
 * reference again. Now it got reachable. So, garbage collector won't destroy
 * it. But if i again nullify and call the garbage collector it won't call the
 * finalize method. Because garbage collector will call the finalize method on
 * the particular object only once
 * 
 * @author Surendar
 *
 */
public class FinalizeMethodEx2 {

  private static FinalizeMethodEx2 f = null;

  @Override
  public void finalize() {
    System.out.println("Finalize method called");
    f = this;
  }

  public static void main(String[] args) throws InterruptedException {
    f = new FinalizeMethodEx2();
    System.out.println("Hash code :" + f.hashCode());
    f = null;
    System.gc();
    Thread.sleep(5000);
    // Will print same hash code since we are pointing to this object only
    System.out.println("Hash code :" + f.hashCode());
    f = null;
    System.gc();
    Thread.sleep(5000);
    System.out.println(f);
    System.out.println("End of main");
  }
}

package main.jvm.related.pgms;

public class FinalizeMethodEx {

  @Override
  public void finalize() {
    System.out.println("Finalize method called");
  }

  public static void main(String[] args) {
    FinalizeMethodEx f = new FinalizeMethodEx();
    System.out.println(f.hashCode());
    f = null;
    System.gc();
    System.out.println("End of main");
  }
}

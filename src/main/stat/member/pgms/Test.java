package main.stat.member.pgms;

import java.io.FileOutputStream;

class Test {

  public static void main(String[] args) {
    try {
      FileOutputStream fout = new FileOutputStream("G:\\testout.txt");
      String s = "Welcome to javaTpoint.";
      byte b[] = s.getBytes();// converting string into byte array
      fout.write(b);
      fout.close();
      System.out.println("success...");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

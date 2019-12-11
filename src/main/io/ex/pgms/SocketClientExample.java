package main.io.ex.pgms;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClientExample {

  public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
    InetAddress inetAdd = InetAddress.getLocalHost();
    Socket socket = null;
    for (int lp1 = 1; lp1 <= 6; lp1++) {
      socket = new Socket(inetAdd.getHostName(), 9876);
      System.out.println("Sending msg to server :");
      ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
      if (lp1 == 6)
        oos.writeObject("exit");
      else
        oos.writeObject("" + lp1);

      ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
      String serverMsg = (String) ois.readObject();
      System.out.println("Received message from server :" + serverMsg);

      ois.close();
      oos.close();
      socket.close();

      Thread.sleep(1000);
    }
  }
}

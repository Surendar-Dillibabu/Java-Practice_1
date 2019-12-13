package main.io.ex.pgms;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientEx {

  public static void main(String[] args) throws UnknownHostException, IOException {
    Socket client = null;

    for (int lp1 = 1; lp1 <= 6; lp1++) {
      client = new Socket(InetAddress.getLocalHost().getHostName(), 9768);
      System.out.println("Client sending message to server");
      DataOutputStream dos = new DataOutputStream(client.getOutputStream());
      dos.writeUTF((lp1 == 6 ? "stop" : "Msg-"+lp1));
      dos.flush();

      if (lp1 != 6) {
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String serverMsg = dis.readUTF();
        System.out.println("Server message :" + serverMsg);
        dis.close();
      }

      dos.close();
      client.close();
    }

  }
}

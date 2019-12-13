package main.io.ex.pgms;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx {

  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(9768);

    while (true) {
      System.out.println("Server waiting for client request");
      Socket client = server.accept();

      DataInputStream dis = new DataInputStream(client.getInputStream());
      String clientMsg = dis.readUTF();
      System.out.println("Client message :" + clientMsg);

      if (!"stop".equalsIgnoreCase(clientMsg)) {
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF("Hi, " + clientMsg);

        dos.flush();
        dos.close();
      }

      dis.close();
      client.close();

      if ("stop".equalsIgnoreCase(clientMsg))
        break;
    }
    System.out.println("Server shutting down");
    server.close();
  }
}

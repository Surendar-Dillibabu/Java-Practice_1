package main.socket.ex.pgms;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerExample {

  private static ServerSocket server = null;

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    server = new ServerSocket(9876);

    while (true) {
      System.out.println("Waiting for the client request");
      Socket socket = server.accept();
      ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

      String message = (String) ois.readObject();
      System.out.println("Message received :" + message);

      ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

      String clientMsg = "Hi client, " + message;
      System.out.println("Sending message to client :" + clientMsg);
      oos.writeObject(clientMsg);

      oos.close();
      ois.close();

      socket.close();

      if (message.equals("exit"))
        break;
    }
    System.out.println("Shutting down the server");
    server.close();
  }
}

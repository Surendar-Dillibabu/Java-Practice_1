package main.io.ex.pgms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx {

  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(9768);

    while (true) {
      System.out.println("Server waiting for client request");
      Socket client = server.accept();
      BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
      StringBuilder reqBuilder = new StringBuilder();
      String request = null, response = null;
      while ((request = br.readLine()) != null) {
        reqBuilder.append(request);
      }

      String clientMsg = reqBuilder.toString();
      System.out.println("Client message :" + clientMsg);
      if (!"exit".equalsIgnoreCase(clientMsg)) {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
        response = "Hi, " + clientMsg;
        pw.write(response);
        pw.close();
      }

      br.close();
      client.close();
      if ("exit".equalsIgnoreCase(clientMsg))
        break;
    }
    System.out.println("Server shutting down");
    server.close();
  }
}

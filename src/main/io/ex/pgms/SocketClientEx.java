package main.io.ex.pgms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientEx {

  public static void main(String[] args) throws UnknownHostException, IOException {
    Socket client = null;

    for (int lp1 = 1; lp1 <= 6; lp1++) {
      client = new Socket(InetAddress.getLocalHost().getHostName(), 9768);
      System.out.println("Client sending message to server");
      PrintWriter bw = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
      bw.write((lp1 == 6 ? "exit" : "Msg-" + lp1));

      if (lp1 != 6) {
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        StringBuilder respBuilder = new StringBuilder();
        String response = null;
        while ((response = br.readLine()) != null) {
          respBuilder.append(response);
        }
        System.out.println("Message received from server :" + respBuilder.toString());
        br.close();
      }

      bw.close();
      client.close();
    }

  }
}

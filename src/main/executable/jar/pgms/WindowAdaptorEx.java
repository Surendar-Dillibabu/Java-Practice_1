package main.executable.jar.pgms;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdaptorEx {

  public static void main(String[] args) {
    Frame f = new Frame();
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        for (int lp1 = 0; lp1 < 10; lp1++) {
          System.out.println("Iam going to close the window :"+lp1);
        }
        System.exit(0);
      }
    });
    f.add(new Label("Customized window example"));
    f.setSize(500, 500);
    f.setVisible(true);
  }
}

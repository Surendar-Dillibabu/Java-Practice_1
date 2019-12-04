package main.thread.ex.pgms;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

  @Override
  public void run() {
    System.out.println("Timer task started at:" + new Date());
    completeTask();
    System.out.println("Timer task finished at:" + new Date());
  }

  private void completeTask() {
    try {
      // assuming it takes 20 secs to complete the task
      Thread.sleep(8000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String args[]) {
    TimerTask timerTask = new MyTimerTask();
    // running timer task as daemon thread
    Timer timer = new Timer(true);
    // Every 5000 milli seconds + starting of first thread to 10000 milliseconds it
    // will call the run method.
    // Note: If the previous execution not completed then it will wait for it to
    // complete even though the time to run next execution is ready
    timer.scheduleAtFixedRate(timerTask, 5000, 10000);
    System.out.println("TimerTask started");
    // cancel after sometime
    try {
      Thread.sleep(50000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    timer.cancel();
    System.out.println("TimerTask cancelled");
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}

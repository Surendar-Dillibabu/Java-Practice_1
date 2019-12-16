package main.concurrency.ex.pgms;

import java.util.concurrent.Callable;

public class SumOfNumbers implements Callable<Integer> {

  private String threadName;
  private int num;

  SumOfNumbers(String threadName, int num) {
    this.threadName = threadName;
    this.num = num;
  }

  public String getThreadName() {
    return threadName;
  }

  public void setThreadName(String threadName) {
    this.threadName = threadName;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
  public Integer call() {
    System.out.println(this.threadName + " is started");
    int sum = 0;
    for (int lp1 = 0; lp1 < num; lp1++) {
      sum += lp1;
    }
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }    
    return sum;
  }
}

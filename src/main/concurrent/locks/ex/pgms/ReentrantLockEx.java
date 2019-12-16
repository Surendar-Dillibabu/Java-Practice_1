package main.concurrent.locks.ex.pgms;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {

  public static void main(String[] args) {
    ReentrantLock re = new ReentrantLock();
    re.lock();
    re.lock();
    System.out.println(re.isLocked()); // true
    System.out.println(re.isHeldByCurrentThread()); // true
    System.out.println(re.getQueueLength()); // 0
    System.out.println(re.getHoldCount()); // 2
    re.unlock();
    System.out.println(re.getHoldCount()); // 1
    System.out.println(re.isLocked()); // true
    re.unlock();
    System.out.println(re.isLocked()); // false
    System.out.println(re.isFair()); // false
  }
}

package main.collectionex.pgms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

  public static void main(String[] args) {

    Queue<Integer> pq = new PriorityQueue<>(); // It follows the default natural sorting order.

    // This code will return the head of the element. But as of now the queue
    // is empty so it will return null
    System.out.println(pq.poll());

    // This code will remove and return the head of the element. But as of now the
    // queue
    // is empty so it will throw NoSuchElementException
    // System.out.println(pq.remove());

    // This code will remove and return the head of the element. But as of now the
    // queue
    // is empty so it will return null
    System.out.println(pq.peek());

    // This code will return the head of the element. But as of now the queue
    // is empty so it will throw NoSuchElementException
    // System.out.println(pq.element());

    for (int lp1 = 1; lp1 <= 10; lp1++) {
      // add method will internally calls offer method only. So, we can use either
      // offer or ad method
      pq.add(lp1);
      // pq.offer(lp1);
    }

    System.out.println(pq); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    System.out.println(pq.poll()); // 1

    System.out.println(pq); // [2, 3, 4, 5, 6, 7, 8, 9, 10]

    System.out.println(pq.remove()); // 2

    System.out.println(pq); // [3, 4, 5, 6, 7, 8, 9, 10]

    // It won't allow the elements which is not comparable.
    // In this below example Bank class is not implemented Comparable.
    // So, while adding second element only it will throw the ClassCastException
    // error.
    // Because first element will be stored in the first index of array without any
    // comparison or shifting operation.
    // That's why it will throw error while inserting second element
    PriorityQueue<Bank> pq2 = new PriorityQueue<>();
    pq2.add(new Bank(100, "ICICI"));
    // pq2.add(new Bank(105, "Indian"));
    System.out.println(pq2);

    // In this below priority queue the BankComparable class implements Comparable
    // interface
    // So, it won't throw any error
    PriorityQueue<BankComparable> pq3 = new PriorityQueue<>();
    pq3.add(new BankComparable(100, "ICICI"));
    pq3.add(new BankComparable(105, "Indian"));
    pq3.add(new BankComparable(101, "SBI"));
    pq3.add(new BankComparable(103, "BOB"));
    pq3.add(new BankComparable(102, "IOB"));
    // Here it won't order the elements based on the comparison. So, ordering will
    // not be there
    System.out.println(pq3);

    // In this below iteration it won't return elements based on the comparator
    // comparison since it will iterate the array and return the element
    System.out.println("Iterating priority queue elements using iterator :");
    Iterator<BankComparable> itr = pq3.iterator();
    while (itr.hasNext()) { 
      BankComparable bc = itr.next();
      System.out.println(bc);
    }

    // In this for-each loop it will return the elements as per the comparison order
    // Since while remove or poll alone it will return the order
    System.out.println("Iterating priority queue elements using for-each loop :");
    int queueSize = pq3.size();
    for (int lp1 = 0; lp1 < queueSize; lp1++) {
      System.out.println(pq3.poll());
    }

    // Here Bank class don't implemented Comparable interface.
    // But while creating the queue object itself we are providing the customized
    // comparator which can be used to compare the elements
    // So, here it won't throw any error
    PriorityQueue<Bank> pq4 = new PriorityQueue<>(new BankComparator());
    pq4.add(new Bank(100, "ICICI"));
    pq4.add(new Bank(105, "Indian"));
    pq4.add(new Bank(101, "SBI"));
    pq4.add(new Bank(103, "BOB"));
    pq4.add(new Bank(102, "IOB"));
    System.out.println("pq4 :" + pq4);
  }
}

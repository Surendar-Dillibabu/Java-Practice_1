package main.collectionex.pgms;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {

  class AlphabetsComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      return o2.compareTo(o1); // Descending order
    }
  }

  public static void main(String[] args) {
    PriorityQueue<Integer> pq2 = new PriorityQueue<>();
    pq2.add(3);
    pq2.add(5);
    pq2.add(8);
    pq2.add(2);
    pq2.add(15);
    pq2.add(1);
    pq2.add(2);
    
    // Here it won't follow the natural ordering. Because PriorityQueue extends AbstractQueue which internally extends AbstractCollection.
    // In this AbstractCollection overrided toString method which will iterate and provide it in the order
    // Generally it won't return based on natural order while iterating or printing
    // [1, 3, 2, 5, 15, 8, 2]
    System.out.println(pq2); 
    
    // It will return as per the natural order only doing peek and poll method.
    // But incase peek it will always return the first element only
    Integer i = 0;
    while ((i = pq2.poll())!= null) System.out.print(i + " ");

    System.out.println();
    
    PriorityQueue<String> pq = new PriorityQueue<>();

    pq.add("A");
    pq.add("Z");
    pq.add("S");
    pq.add("L");
    pq.add("O");

    // Here it will follows the default natural sorting order.
    // But some operating system won't follow the Queue approach of sorting
    System.out.println(pq); // [A, L, S, Z, O]

    PriorityQueue<String> pq1 = new PriorityQueue<>(new PriorityQueueEx1().new AlphabetsComparator());

    pq1.add("A");
    pq1.add("Z");
    pq1.add("S");
    pq1.add("L");
    pq1.add("O");

    // Here it will follows the customized comparator sorting order.
    // But some operating system won't follow the Queue approach of sorting
    System.out.println(pq1); // [Z, O, S, A, L]
    System.out.println(pq1.comparator()); // [Z, O, S, A, L]
  }
}

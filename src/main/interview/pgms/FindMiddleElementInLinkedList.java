package main.interview.pgms;

public class FindMiddleElementInLinkedList {

  public static void main(String args[]) {
    // creating CustomLinkedList with 5 elements including head
    CustomLinkedList linkedList = new CustomLinkedList();
    CustomLinkedList.Node head = linkedList.head();
    linkedList.add(new CustomLinkedList.Node("1"));
    linkedList.add(new CustomLinkedList.Node("2"));
    linkedList.add(new CustomLinkedList.Node("3"));
    linkedList.add(new CustomLinkedList.Node("4"));

    // finding middle element of CustomLinkedList in single pass
    CustomLinkedList.Node current = head;
    int length = 0;
    CustomLinkedList.Node middle = head;

    while (current.next() != null) {
      length++;
      if (length % 2 == 0) {
        middle = middle.next();
      }
      current = current.next();
    }

    if (length % 2 == 1) {
      middle = middle.next();
    }

    System.out.println("length of LinkedList: " + length);
    System.out.println("middle element of LinkedList : " + middle);

  }

}

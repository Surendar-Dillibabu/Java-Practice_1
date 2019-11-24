package main.interview.pgms;

public class CycliLinkedListTesting {

  public static void main(String[] args) {
    // creating CustomLinkedList with 5 elements including head
    CustomLinkedList linkedList = new CustomLinkedList();
    linkedList.add(new CustomLinkedList.Node("101"));
    CustomLinkedList.Node cycle = new CustomLinkedList.Node("201");
    linkedList.add(cycle);
    linkedList.add(new CustomLinkedList.Node("301"));
    linkedList.add(new CustomLinkedList.Node("401"));
    linkedList.add(new CustomLinkedList.Node("501"));
    linkedList.add(new CustomLinkedList.Node("601"));
    linkedList.add(new CustomLinkedList.Node("701"));
    linkedList.add(cycle);

    if (linkedList.isCyclic()) {
      System.out.println("Linked List is cyclic as it contains cycles or loop");
    } else {
      System.out.println("CustomLinkedList is not cyclic, no loop or cycle found");
    }

  }
}

package main.collectionex.pgms;


public class SingleLinkedListEx {

  public static void main(String[] args) {
    SinglyLinkedList<Integer> cl = new SinglyLinkedList<>();
    cl.add(10);
    cl.add(20);
    cl.add(12);
    cl.add(8);
    cl.addFirst(52);
    cl.addLast(26);
    System.out.println("Custom linked list elements :"+cl);
    System.out.println("Get element by index :"+cl.get(2));
    System.out.println("Remove element by index :"+cl.remove(3));
    System.out.println("Remove first element :"+cl.remove());
    
    System.out.println("Final elements :"+cl);
  }
}

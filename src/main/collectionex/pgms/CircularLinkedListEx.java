package main.collectionex.pgms;

public class CircularLinkedListEx {

  public static void main(String[] args) {
    CircularLinkedList<Integer> cls = new CircularLinkedList<>();
    cls.add(10);
    cls.add(20);
    cls.add(12);
    cls.add(8);
    cls.addFirst(52);
    cls.addLast(26);
    System.out.println("Custom linked list elements :" + cls);
    System.out.println("Get element by index :" + cls.get(2));
    System.out.println("Remove element by index :" + cls.remove(3));
    System.out.println("Remove first element :" + cls.remove());
    System.out.println("Remove last element :" + cls.removeLast());

    System.out.println("Final elements :" + cls);
  }
}

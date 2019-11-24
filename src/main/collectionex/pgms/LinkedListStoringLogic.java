package main.collectionex.pgms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


/**
 * LinkedList extends AbstractSequentialList class and implements List, Dequeue, Clonable and Serializable interfaces
 * LinkedList is stored the element as a Node<E> which is an private static internal class of LinkedList.
 * The Node<E> element contains the current element item (i.e. E item), next item (i.e. Node<E> next) and previous item (i.e. Node<E> prev)
 * LinkedList follows an doubly linked list data structure so each element is linked with prev and next element.
 * So, insertion on an particular index or insertion on first or last index is fast since it just needs to map the prev and next element.
 * So, insertion and remove operation won't have take much time (i.e. o(1)) but search operation it takes o(n) since it has to traverse the linked list complete node to get the searched element 
 * @author Surendar
 *
 */
public class LinkedListStoringLogic {

  public static void main(String[] args) {
    /*
     * Types of linked list object creation. 
     * LinkedList<String> ls = new LinkedList<>();
     * LinkedList<String> ls = new LinkedList<>(Collection c); 
    */
    LinkedList<String> ls = new LinkedList<>(); /// It won't maintain any capacity based on the insertion it will increase the Node elements one by one.    
    ls.add("aaa");
    ls.add("bbb");
    ls.add("aaa");
    ls.add("ccc");
    System.out.println("Linked list elements :"+ls);
    
    System.out.println("Forward iteration :");
    ListIterator<String> forwardIter = ls.listIterator();
    while(forwardIter.hasNext()) {
      System.out.println(forwardIter.next());
    }
    
    System.out.println("Backward iteration :");
    ListIterator<String> itr = ls.listIterator(ls.size());
    while(itr.hasPrevious()) {
      System.out.println(itr.previous());
    }
    
    System.out.println("Backward iteration using descendingIterator :");    
    Iterator<String> descIter = ls.descendingIterator();
    while(descIter.hasNext()) {
      System.out.println(descIter.next());
    }
  }
}

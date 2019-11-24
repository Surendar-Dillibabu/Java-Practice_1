package main.collectionex.pgms;

public class CircularLinkedList<E> {

  private int size;

  private CircularNode<E> header;

  private static class CircularNode<E> {

    private E data;

    private CircularNode<E> next;

    CircularNode(E data, CircularNode<E> next) {
      this.data = data;
      this.next = next;
    }
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return (size > 0 ? false : true);
  }

  public boolean isValidIndex(int index) {
    if (index < 0 || index > (size - 1))
      throw new IndexOutOfBoundsException("Not a valid index range");

    return true;
  }

  public void addFirst(E data) {
    CircularNode<E> newNode = new CircularNode<>(data, header);
    header = newNode;
    size++;
  }

  public void addLast(E data) {
    CircularNode<E> newNode = new CircularNode<>(data, header);
    if (header == null) {
      header = newNode;
    } else {
      CircularNode<E> lastNode = header;
      int iterationCnt = 0;
      do {
        lastNode = (lastNode.next == null ? lastNode : lastNode.next);
        iterationCnt++;
      } while ((size - 1) > iterationCnt && lastNode.next != null);
      lastNode.next = newNode;
    }
    size++;
  }

  public void add(E data) {
    addLast(data);
  }

  public void add(E data, int index) {
    if (isValidIndex(index)) {
      CircularNode<E> prevNode = header;
      CircularNode<E> nextNode = header;
      for (int lp1 = 0; lp1 <= index; lp1++) {
        prevNode = nextNode;
        nextNode = (nextNode != null ? nextNode.next : null);
      }
      CircularNode<E> newNode = new CircularNode<>(data, (nextNode != null ? nextNode.next : null));
      if (prevNode != null) {
        prevNode.next = newNode;
      } else {
        header = newNode;
      }
      size++;
    }
  }

  public E remove() {
    E data = null;
    if (!isEmpty()) {
      data = header.data;
      header = header.next;
      size--;
    }
    return data;
  }

  public E removeFirst() {
    return remove();
  }

  public E removeLast() {
    E data = null;
    if (!isEmpty()) {
      CircularNode<E> prevNode = header;
      CircularNode<E> lastNode = header;
      for (int lp1 = 0; lp1 < (size - 1); lp1++) {
        prevNode = lastNode;
        lastNode = (lastNode.next != null ? lastNode.next : lastNode);
      }
      if (size == 1) {
        data = header.data;
        header = null;
      } else {
        prevNode.next = header;
        data = prevNode.next.data;
      }
      size--;
    }
    return data;
  }

  public E remove(int index) {
    E data = null;
    if (isValidIndex(index)) {
      CircularNode<E> prevNode = header;
      CircularNode<E> nextNode = header;
      for (int lp1 = 0; lp1 < index; lp1++) {
        prevNode = nextNode;
        nextNode = (nextNode != null ? nextNode.next : null);
      }
      data = nextNode.data;
      prevNode.next = nextNode.next;
      size--;
    }
    return data;
  }

  public E get(int index) {
    E data = null;
    if (isValidIndex(index)) {
      CircularNode<E> temp = header;
      for (int lp1 = 0; lp1 < index; lp1++) {
        temp = (temp != null ? temp.next : null);
      }
      data = temp.data;
    }
    return data;
  }

  public String toString() {
    StringBuilder str = new StringBuilder("[");
    CircularNode<E> temp = header;
    for (int lp1 = 0; lp1 < size; lp1++) {
      str.append(temp.data).append((lp1 == (size - 1) ? "" : ","));
      temp = temp.next;
    }
    str.append("]");
    return str.toString();
  }
}

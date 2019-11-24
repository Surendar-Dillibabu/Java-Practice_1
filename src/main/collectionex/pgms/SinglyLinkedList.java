package main.collectionex.pgms;

public class SinglyLinkedList<E> {

  private CustomNode<E> header;
  private int size;

  private static class CustomNode<E> {

    E data;
    CustomNode<E> next;

    CustomNode(E data, CustomNode<E> next) {
      this.data = data;
      this.next = next;
    }
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size > 0 ? false : true;
  }

  public boolean isValidIndex(int index) {
    if (index < 0 || index > (size - 1)) {
      throw new IndexOutOfBoundsException("Index not in the range");
    }
    return true;
  }

  public void addFirst(E data) {
    final CustomNode<E> newNode = new CustomNode<E>(data, header);
    header = newNode;
    size++;
  }

  public void addLast(E data) {
    final CustomNode<E> newNode = new CustomNode<E>(data, null);
    if (header == null) {
      header = newNode;
    } else {
      CustomNode<E> lastNode = header;
      do {
        lastNode = (lastNode.next == null ? lastNode : lastNode.next);
      } while (lastNode.next != null);
      lastNode.next = newNode;
    }
    size++;
  }

  public void add(E data) {
    addLast(data);
  }

  public void add(E data, int index) {
    if (isValidIndex(index)) {
      CustomNode<E> lastNode = null;
      CustomNode<E> prevNode = null;
      for (int lp1 = 0; lp1 <= index; lp1++) {
        prevNode = lastNode;
        lastNode = (lp1 == 0) ? header : lastNode.next;
      }
      final CustomNode<E> newNode = new CustomNode<E>(data,
          (lastNode != null && lastNode.next != null) ? lastNode.next : null);
      if (prevNode != null) {
        prevNode.next = newNode;
      } else {
        header.next = newNode;
      }
      size++;
    }
  }

  public E get(int index) {
    CustomNode<E> element = null;
    if (isValidIndex(index)) {
      for (int lp1 = 0; lp1 <= index; lp1++) {
        element = (lp1 == 0 ? header : element.next);
      }
    }
    return (element != null ? element.data : null);
  }

  public E remove() {
    E data = null;
    if (!isEmpty()) {
      data = header.data;
      header = (header.next != null ? header.next : null);
      size--;
    }
    return data;
  }

  public E remove(int index) {
    E data = null;
    if (isValidIndex(index)) {
      CustomNode<E> prevElement = null, element = null;
      for (int lp1 = 0; lp1 <= index; lp1++) {
        if (lp1 == 0) {
          element = header;
        } else {
          prevElement = element;
          element = prevElement.next;
        }
      }
      if (prevElement != null)
        prevElement.next = element.next;
      else
        header = element.next;

      data = element.data;
      element = null; // For garbage collection
      size--;
    }
    return data;
  }

  public String toString() {
    StringBuilder str = new StringBuilder("[");
    CustomNode<E> element = header;
    for (int lp1 = 0; lp1 < size; lp1++) {
      str.append(element.data).append(lp1 == (size - 1) ? "" : ",");
      element = element.next;
    }
    str.append("]");
    return str.toString();
  }
}

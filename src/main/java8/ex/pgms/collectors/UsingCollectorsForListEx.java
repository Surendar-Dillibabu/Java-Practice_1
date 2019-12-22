package main.java8.ex.pgms.collectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingCollectorsForListEx {

  public static void main(String[] args) {
    String[] nameArr = { "Surendar", "Ram", "Tamil", "Vivek", "Ram", "Vivek" };

    // It returns the list which is not guarantee about the type of list. Either
    // ArrayList or LinkedList
    List<String> nameList = Arrays.stream(nameArr).distinct().collect(Collectors.toList());
    System.out.println("nameList :" + nameList);

    // If you want the particular type of List or Set we have to use toCollection
    // method
    LinkedList<String> nameLinkedList = Arrays.stream(nameArr).distinct()
        .collect(Collectors.toCollection(LinkedList::new));
    System.out.println("nameLinkedList :" + nameLinkedList);

  }
}

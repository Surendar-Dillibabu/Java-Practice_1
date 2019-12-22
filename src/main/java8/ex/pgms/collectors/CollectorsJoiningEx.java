package main.java8.ex.pgms.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsJoiningEx {

  public static void main(String[] args) {
    String[] nameArr = { "Surendar", "Ram", "Tamil", "Vivek", "Ram", "Vivek" };

    String concatedNames = Stream.of(nameArr).distinct().collect(Collectors.joining());
    System.out.println("concatedNames :" + concatedNames);

    String concatedNamesByComma = Stream.of(nameArr).distinct().collect(Collectors.joining(","));
    System.out.println("concatedNamesByComma :" + concatedNamesByComma);

    // The prefix and suffix will be added to the before first name start and after
    // last name end.
    // Ex: prefix||Surendar,Ram,Tamil,Vivek||suffix
    String concatedNamesByPrefixSuffix = Stream.of(nameArr).distinct()
        .collect(Collectors.joining(",", "prefix||", "||suffix"));
    System.out.println("concatedNamesByPrefixSuffix :" + concatedNamesByPrefixSuffix);
  }
}

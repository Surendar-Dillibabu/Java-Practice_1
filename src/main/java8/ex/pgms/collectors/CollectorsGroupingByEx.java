package main.java8.ex.pgms.collectors;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsGroupingByEx {

  public static void main(String[] args) {
    Stream<Locale> streamOfLocales = Stream.of(Locale.getAvailableLocales());
    
    Map<String, List<Locale>> countryToLocale 
      = streamOfLocales
          .collect(Collectors.groupingBy(Locale::getCountry));
    
    System.out.println("countryToLocale :"+countryToLocale);
  }
}

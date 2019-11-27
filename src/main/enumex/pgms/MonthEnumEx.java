package main.enumex.pgms;

public class MonthEnumEx {

  public static void main(String[] args) {
    Month[] monthEnum = Month.values();

    for (Month m : monthEnum) {
      System.out.println("Month name :" + m + " number :" + m.getMonthNo());
    }
  }
}

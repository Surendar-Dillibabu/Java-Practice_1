package main.enumex.pgms;

public class DayEnumEx {

  public static void main(String[] args) {
    Day[] dayArr = Day.values();
    
    for(Day d : dayArr) {
      System.out.println("Day :"+d+", ordinal :"+d.ordinal());
    }
  }
}

package main.pgms.practices;

public class SwitchCaseExample {

  public static void main(String args[]) {
    SwitchCaseExample switchCaseExample = new SwitchCaseExample();
    // switchCaseExample.switchWithInteger();
    switchCaseExample.switchWithString();
  }

  public void switchWithInteger() {
    Integer day = 0;
    switch (day) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Invalid day");
    }
  }

  public void switchWithString() {
    String mon = "January";
    switch (mon) {
      case "January":
        System.out.println("January month");
        break;
      case "February":
        System.out.println("February month");
        break;
      case "March":
        System.out.println("March month");
        break;
      case "April":
        System.out.println("April month");
        break;
      case "May":
        System.out.println("May month");
        break;
      case "June":
        System.out.println("June month");
        break;
      case "July":
        System.out.println("July month");
        break;
      case "August":
        System.out.println("August month");
        break;
      case "September":
        System.out.println("September month");
        break;
      case "October":
        System.out.println("October month");
        break;
      case "November":
        System.out.println("November month");
        break;
      case "December":
        System.out.println("December month");
        break;
      default:
        System.out.println("Invalid month");
    }
  }
}

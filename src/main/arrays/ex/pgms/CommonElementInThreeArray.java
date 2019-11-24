package main.arrays.ex.pgms;

public class CommonElementInThreeArray {

  public static void main(String[] args) {
    int[] firstArr = { 1, 5, 10, 20, 40, 80 };
    int[] secondArr = { 6, 7, 20, 80, 100 };
    int[] thirdArr = { 3, 4, 15, 20, 30, 70, 80, 120 };

    System.out.println("Common elements present in the array");
    for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
      for (int lp2 = 0; lp2 < secondArr.length; lp2++) {
        if (firstArr[lp1] == secondArr[lp2]) {
          for (int lp3 = 0; lp3 < thirdArr.length; lp3++) {
            if (secondArr[lp2] == thirdArr[lp3]) {
              System.out.println(thirdArr[lp3]);
            }
          }
        }
      }
    }
  }
}

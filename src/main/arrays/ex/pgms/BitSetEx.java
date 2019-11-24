package main.arrays.ex.pgms;

import java.util.BitSet;

public class BitSetEx {

  private static int N_BITS = 16;

  public static void main(String[] args) {
    // Default 16bits. All are set to 0 (i.e. default false). Stored value in bits =
    // 0000000000000000
    BitSet bs = new BitSet(16);
    BitSet bs1 = new BitSet();
    printBits("Bits default value :", bs);

    bs.set(5); // Now after setting the 5th index set to true. (i.e. 1)
    printBits("Bits after setting the 5th bit value :", bs);

    bs.set(15); // Now after setting the 5th index set to true. (i.e. 1)
    printBits("Bits after setting the 15th bit value :", bs);

    // Returns the number of bits set to true in this BitSet.
    System.out.println("Number of bits set to true :" + bs.cardinality());

    bs1.set(5);

    bs.and(bs1);

    System.out.println("Number of bits set to true :" + bs.cardinality());

    printBits("Bits bs after and operation with bs1 :", bs);
  }

  public static void printBits(String prompt, BitSet b) {
    System.out.print(prompt + " ");
    for (int i = 0; i < N_BITS; i++) {
      System.out.print(b.get(i) ? "1" : "0");
    }
    System.out.println();
  }
}

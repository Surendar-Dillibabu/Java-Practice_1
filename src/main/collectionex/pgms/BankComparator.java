package main.collectionex.pgms;

import java.util.Comparator;

public class BankComparator implements Comparator<Bank> {

  @Override
  public int compare(Bank o1, Bank o2) {
    return o1.getBankId() - o2.getBankId();
  }
}

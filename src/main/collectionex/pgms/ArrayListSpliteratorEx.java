package main.collectionex.pgms;

import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayListSpliteratorEx {

  public static void main(String[] args) {
    ArrayListSpliteratorEx obj = new ArrayListSpliteratorEx();
    ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
    al.add(5);
    al.add(18);
    al.add(1);
    al.add(8);
    al.add(62);
    al.add(25);
    al.add(36);

    Spliterator<Integer> sp1 = al.spliterator();

    System.out.println("Estimate size :" + sp1.estimateSize());
    System.out.println("Exact size if known :" + sp1.getExactSizeIfKnown());
    // tryAdvance is like iterator next method. Returns the next element
    sp1.tryAdvance(s -> System.out.println(s));
    sp1.tryAdvance(s -> System.out.println(s));

    System.out.println("Estimate size :" + sp1.estimateSize());
    System.out.println("Exact size if known :" + sp1.getExactSizeIfKnown());
    System.out.println("It will iterate the remaining elements present in the ArrayList");
    sp1.forEachRemaining(element -> {
      System.out.println(element);
    });

    // In this case it will throw NullPointerExcpetion since it has already iterated
    // all the elements using the tryAdvance and forEachRemaining
    /*
     * Spliterator<Integer> sp2 = sp1.trySplit(); sp2.forEachRemaining(element -> {
     * System.out.println(element); });
     */
    obj.trySplitEx();
  }

  public void trySplitEx() {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(30);
    al.add(3);
    al.add(18);
    al.add(1);
    al.add(8);
    al.add(25);
    al.add(36);

    Spliterator<Integer> sp1 = al.spliterator();
    Spliterator<Integer> sp2 = sp1.trySplit();

    System.out.println("Estimate size :" + sp1.estimateSize());
    System.out.println("Exact size if known :" + sp1.getExactSizeIfKnown());
    System.out.println("Iterate elements using main spliterator :");
    sp1.forEachRemaining(s -> System.out.println(s));

    System.out.println("Estimate size :" + sp2.estimateSize());
    System.out.println("Exact size if known :" + sp2.getExactSizeIfKnown());
    System.out.println("Iterate elements using sub spliterator :");
    sp2.forEachRemaining(s -> System.out.println(s));
  }
}

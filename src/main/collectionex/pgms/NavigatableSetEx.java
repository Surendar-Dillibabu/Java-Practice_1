package main.collectionex.pgms;

import java.util.TreeSet;

public class NavigatableSetEx {

  public static void main(String[] args) {
    TreeSet<Integer> st = new TreeSet<>();
    st.add(25);
    st.add(15);
    st.add(85);
    st.add(65);
    st.add(51);
    st.add(57);
    st.add(50);
    st.add(12);
    st.add(950);
    st.add(20);

    System.out.println("Elements present in the TreeSet :" + st);
    System.out.println("First element :" + st.first());
    System.out.println("Last element :" + st.last());

    // Returns first element lesser than or equal to 50. (i.e.) <= 50
    System.out.println(st.floor(50));

    // Returns first element before 50. (i.e.) < 50
    System.out.println(st.lower(50));

    // Returns first element greater than or equal to 50. (i.e.) >= 50
    System.out.println(st.ceiling(50));

    // Returns first element after 50. (i.e.) > 50
    System.out.println(st.higher(50));

    System.out.println("Elements present in the TreeSet with descending order :" + st.descendingSet());

    // Retrives and removes the first element from the bucket. If not present
    // returns
    // null
    System.out.println(st.pollFirst());

    // Retrives and removes the last element from the bucket. If not present returns
    // null
    System.out.println(st.pollLast());

    System.out.println("Elements present in the TreeSet after polling :" + st);

  }
}

package main.collectionex.pgms;

import java.util.HashMap;

public class HashMapWithCustomObject {

  public static void main(String[] args) {
    Department d = new Department(100, "testing");
    HashMap<Department, String> hm = new HashMap<>();
    hm.put(d, "original");
    System.out.println(hm);
    System.out.println(hm.get(d)); // original

    d.setDepartmentId(200);
    System.out.println(hm.get(d)); // null
  }
}

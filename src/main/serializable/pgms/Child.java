package main.serializable.pgms;

import java.io.Serializable;

public class Child extends Parent implements Serializable {

  /**
   * 
  */
  private static final long serialVersionUID = 1L;

  private int childId;

  Child() {
    this.childId = 20;
    System.out.println("Child constructor");
  }

  public int getChildId() {
    return childId;
  }

  public void setChildId(int childId) {
    this.childId = childId;
  }

  @Override
  public String toString() {
    return "Child [childId=" + childId + "]";
  }

}

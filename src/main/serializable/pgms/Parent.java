package main.serializable.pgms;

public class Parent {

  private int parentId;

  Parent() {
    this.parentId = 10;
    System.out.println("Parent class constructor");
  }

  public int getParentId() {
    return parentId;
  }

  public void setParentId(int parentId) {
    this.parentId = parentId;
  }

  @Override
  public String toString() {
    return "Parent [parentId=" + parentId + "]";
  }

}

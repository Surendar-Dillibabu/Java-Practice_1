package main.serializable.pgms;

import java.io.Serializable;

public class Department implements Serializable {

  /**
   * 
  */
  private static final long serialVersionUID = 1L;

  private int deptId;
  private String deptName;

  Department(int deptId, String deptName) {
    this.deptId = deptId;
    this.deptName = deptName;
  }

  @Override
  public String toString() {
    return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
  }

}

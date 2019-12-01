package main.serializable.pgms;

import java.io.Serializable;

public class College implements Serializable {

  /**
   * 
  */
  private static final long serialVersionUID = 1L;

  public static final College INSTANCE = new College();

  private int collegeId;
  private String collegeName;

  // Making them not visible to the classes
  private College() {
  }

  public int getCollegeId() {
    return collegeId;
  }

  public void setCollegeId(int collegeId) {
    this.collegeId = collegeId;
  }

  public String getCollegeName() {
    return collegeName;
  }

  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null) {
      College c = (College) obj;
      if (this.getCollegeId() == c.getCollegeId() && this.getCollegeName().equalsIgnoreCase(this.getCollegeName())) {
        return true;
      }
    }
    return false;
  }

  // readResolve method will be called when deserialization happen and it will
  // always return the singleton object
  public Object readResolve() {
    return INSTANCE;
  }

  @Override
  public String toString() {
    return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + "]";
  }

}

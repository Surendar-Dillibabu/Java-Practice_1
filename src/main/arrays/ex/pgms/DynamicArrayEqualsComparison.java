package main.arrays.ex.pgms;

/**
 * This class contains dynamic deep equals comparison as like Arrays.deepEquals
 * method
 * 
 * @author Surendar
 *
 */
public class DynamicArrayEqualsComparison {

  public static void main(String[] args) {
    DynamicArrayEqualsComparison obj = new DynamicArrayEqualsComparison();
    int[][][] intFirstArr = new int[][][] { { { 80, 18, 12 }, { 86 } }, { { 34 }, { 60 } },
        { { 5, 8, 158, 267, 31 } } };
    int[][][] intSecondArr = new int[][][] { { { 80, 18, 12 }, { 86 } }, { { 34 }, { 60 } },
        { { 5, 8, 158, 267, 31 } } };

    // int array comparison
    System.out.println(
        "Both int arrays are " + (obj.dynamicEqualsComparsion(intFirstArr, intSecondArr) ? "equal" : "not equal"));

    float[][][] floatFirstArr = new float[][][] { { { 80.5F, 18.2F, 12.6F }, { 86F } }, { { 34.6F }, { 60.8F } },
        { { 5.9F, 8.1F, 158F, 267.988F, 31.546F } } };
    float[][][] floatSecondArr = new float[][][] { { { 80.5F, 18.2F, 12F }, { 86F } }, { { 34.6F }, { 60.8F } },
        { { 5.9F, 8.1F, 158F, 267.988F, 31.546F } } };

    // float array comparison
    System.out.println("Both float arrays are "
        + (obj.dynamicEqualsComparsion(floatFirstArr, floatSecondArr) ? "equal" : "not equal"));
  }

  public boolean dynamicEqualsComparsion(Object[] firstArr, Object[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }

  public boolean deepEqualsComparison(Object firstArr, Object secondArr) {
    boolean equalFlag = true;
    if (firstArr instanceof Object[] && secondArr instanceof Object[]) {
      equalFlag = objectDeepEquals((Object[]) firstArr, (Object[]) secondArr);
    } else if (firstArr instanceof short[] && secondArr instanceof short[]) {
      equalFlag = shortDeepEquals((short[]) firstArr, (short[]) secondArr);
    } else if (firstArr instanceof byte[] && secondArr instanceof byte[]) {
      equalFlag = byteDeepEquals((byte[]) firstArr, (byte[]) secondArr);
    } else if (firstArr instanceof int[] && secondArr instanceof int[]) {
      equalFlag = intDeepEquals((int[]) firstArr, (int[]) secondArr);
    } else if (firstArr instanceof long[] && secondArr instanceof long[]) {
      equalFlag = longDeepEquals((long[]) firstArr, (long[]) secondArr);
    } else if (firstArr instanceof char[] && secondArr instanceof char[]) {
      equalFlag = charDeepEquals((char[]) firstArr, (char[]) secondArr);
    } else if (firstArr instanceof float[] && secondArr instanceof float[]) {
      equalFlag = floatDeepEquals((float[]) firstArr, (float[]) secondArr);
    } else if (firstArr instanceof double[] && secondArr instanceof double[]) {
      equalFlag = doubleDeepEquals((double[]) firstArr, (double[]) secondArr);
    } else if (firstArr instanceof boolean[] && secondArr instanceof boolean[]) {
      equalFlag = booleanDeepEquals((boolean[]) firstArr, (boolean[]) secondArr);
    }

    else {
      equalFlag = firstArr.equals(secondArr);
    }
    return equalFlag;
  }

  public boolean objectDeepEquals(Object[] firstArr, Object[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }

  public boolean shortDeepEquals(short[] firstArr, short[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }

  public boolean byteDeepEquals(byte[] firstArr, byte[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }

  public boolean intDeepEquals(int[] firstArr, int[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }

  public boolean longDeepEquals(long[] firstArr, long[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }

  public boolean charDeepEquals(char[] firstArr, char[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }

  public boolean floatDeepEquals(float[] firstArr, float[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }

  public boolean doubleDeepEquals(double[] firstArr, double[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }

  public boolean booleanDeepEquals(boolean[] firstArr, boolean[] secondArr) {
    boolean equalFlag = true;
    if (firstArr != secondArr && firstArr != null && secondArr != null && firstArr.length == secondArr.length) {
      for (int lp1 = 0; lp1 < firstArr.length; lp1++) {
        equalFlag = deepEqualsComparison(firstArr[lp1], secondArr[lp1]);
        if (equalFlag == false) {
          break;
        }
      }
    } else {
      equalFlag = false;
    }
    return equalFlag;
  }
}

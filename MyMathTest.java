package com.in28minute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MyMathTest {

  MyMath math = new MyMath();

  @Test
  public void calculateSum_ThreeMemberArray() {
    assertEquals(6, math.calculateSum(new int[] { 1, 2, 3 }));
  }

  @Test
  public void calculateSum_ZeroLengthArray() {
    assertEquals(0, math.calculateSum(new int[] { }));
  }
}

package com.in28minute;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MyAssertTest {

  List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

  @Test
  public void test() {
    boolean test = todos.contains("AWS");
    boolean test2 = todos.contains("GCP");
    assertTrue(test);
    assertFalse(test2);
    assertArrayEquals(new int[] {1,2}, new int[] {2});
  }
}

package com.example;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleTest {

  @Test
  public void simpleTest() {
    String name = "my name";
    assertThat(name).isEqualTo("my name");
    assertThat(System.getProperty("my.prop")).isEqualTo("hello");
  }
}
package com.example;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleTest {
  // With "--initialize-at-build-time=com.example", this initialization runs at build time.
  static final String myProp= System.getProperty("my.prop");

  @Test
  public void simpleTest() {
    String name = "my name";
    assertThat(name).isEqualTo("my name");
    assertThat(myProp).isEqualTo("hello");
  }
}
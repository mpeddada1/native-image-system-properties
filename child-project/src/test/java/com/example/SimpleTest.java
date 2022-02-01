package com.example;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleTest {

  private static final String PROJECT_ENV_NAME = "MY_ENV_VARIABLE";

  @Test
  public void simpleTest() {
    String testClass = System.getProperty(PROJECT_ENV_NAME, System.getenv(PROJECT_ENV_NAME));
    String name = "my name";
    assertThat(name).isEqualTo("my name");
    // assertThat(System.getProperty("my.prop")).isEqualTo("hello");
    assertThat(testClass).isEqualTo("hello");
  }
}
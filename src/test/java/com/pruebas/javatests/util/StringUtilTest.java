package com.pruebas.javatests.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {

  @Test
  public void testRepeat() {
    assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    assertEquals("Hola", StringUtil.repeat("Hola", 1));
  }
}
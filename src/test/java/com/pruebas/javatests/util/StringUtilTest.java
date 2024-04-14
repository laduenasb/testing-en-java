package com.pruebas.javatests.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilTest {

  @Test
  public void repeat_string_once() {
    assertEquals("Hola", StringUtil.repeat("Hola", 1));
  }
  @Test
  public void repeat_string_multiple_times() {
    assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
  }
  @Test
  public void repeat_string_zero_times() {
    assertEquals("", StringUtil.repeat("Hola", 0));
  }
  @Test
  public void repeat_string_negative_times() {
    assertThrows(IllegalArgumentException.class, () -> StringUtil.repeat("Hola", -1), "Se esperaba una excepción de argumento ilegal");
  }
}
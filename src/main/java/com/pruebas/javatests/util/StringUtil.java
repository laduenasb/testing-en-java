package com.pruebas.javatests.util;

class StringUtil {
  public static String repeat(String str, int times){
    if(times<0){
      throw new IllegalArgumentException("Negative times not allowed");
    }
    String result = "";
    for (int ii = 0; ii < times; ii++) {
      result += str;
    }
    return result;
  }
}

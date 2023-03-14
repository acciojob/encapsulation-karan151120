package com.driver;

public class Main {
  public static void main(String[] args) {
      RWOnly obj = new RWOnly();

      //java: name has private access in com.driver.RWOnly

      obj.setter("karan");

      obj.getter();
  }
}
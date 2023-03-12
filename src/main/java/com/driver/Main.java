package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();
    //obj.i = 5; // i has private access in RWOnly
    //System.out.println(obj.i); // i has private access in RWOnly
    
        obj.setter(4);
        System.out.println(obj.getter());
  }
}

package com.crm.utils;

public class A
{
    int x=10;
  public static void main(String[] args) {
    A a1=new A();
    System.out.println("Hello, World!");
      System.out.println(a1.x);
      int y=a1.test();
      System.out.println(y);

      B b1=new B();
      int x=b1.otpGen();
      System.out.println(x);
  }

  public int test(){
      return 100;
  }
}

package com.learnjava.java8features.methodrefernces;

import java.util.function.Consumer;

public class LambdaVariableExample1 {

  public static void main(String[] args) {

    int i = 0;
    // can't use the local variable as a lambda parameter, nor declare a local variable inside a
    // Lambda named outside
    //    Consumer<Integer> c =
    //        (i) -> {
    //			int i =2;
    //          System.out.println("Value is :  " + i);
    //        };

    Consumer<Integer> c1 =
        (i1) -> {
          System.out.println("Value is :  " + i);
        };
    System.out.println("Value is :  " + i);
  }
}

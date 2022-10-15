package com.learnjava.java8features.methodrefernces;

import java.util.function.Consumer;

public class LambdaVariableExample2 {

  static int valueStatic = 4;

  public static void main(String[] args) {

    int value = 4; // local variable
    Consumer<Integer> c =
        (i) -> {
          System.out.println(value);
        };

    // can't modify value inside the Lambda scope
    //    Consumer<Integer> c1 =
    //        (i) -> {
    //          value++;
    //          System.out.println(value + i);
    //        };
    //   only if varibale is static modify value inside the Lambda scope
    Consumer<Integer> c2 =
        (i) -> {
          valueStatic++;
          System.out.println(valueStatic + i);
        };
    c.accept(4);
    c2.accept(5);
    ;
  }
}

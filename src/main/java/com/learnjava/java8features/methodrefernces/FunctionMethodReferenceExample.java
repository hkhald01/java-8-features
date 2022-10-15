package com.learnjava.java8features.methodrefernces;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

  static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
  static Function<String, String> toUpperCaseLambdaMethodName = String::toUpperCase;

  public static void main(String[] args) {

    System.out.println(toUpperCaseLambda.apply("java8"));
    System.out.println(toUpperCaseLambdaMethodName.apply("java11"));
  }
}

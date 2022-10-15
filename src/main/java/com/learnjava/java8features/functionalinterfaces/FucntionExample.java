package com.learnjava.java8features.functionalinterfaces;

import java.util.function.Function;

public class FucntionExample {

  static Function<String, String> function = (name) -> name.toUpperCase();
  static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" default");

  public static void main(String[] args) {
    System.out.println("Result is : " + function.apply("java8"));
    System.out.println("Result of andthen is : " + function.andThen(addSomeString).apply("java8"));
    System.out.println("Result of andthen is : " + function.compose(addSomeString).apply("java8"));
    System.out.println("Result of performaConcat is : " + performConcat("Heikel"));
  }

  public static String performConcat(String str) {
    return addSomeString.apply(str);
  }
}

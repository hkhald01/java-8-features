package com.learnjava.java8features.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

  static Comparator<Integer> compator = (a, b) -> a.compareTo(b);

  public static void main(String[] args) {

    BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

    System.out.println(binaryOperator.apply(3, 5));

    BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(compator);

    System.out.println("Result of MaxBy is: " + maxBy.apply(4, 5));

    BinaryOperator<Integer> minBy = BinaryOperator.minBy(compator);

    System.out.println("Result of MinBy is: " + minBy.apply(4, 5));
  }
}

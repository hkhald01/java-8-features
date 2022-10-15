package com.learnjava.java8features.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

  static Predicate<Integer> p1 = (i) -> i % 2 == 0;
  static Predicate<Integer> p2 = (i) -> i % 5 == 0;

  public static void main(String[] args) {

    System.out.println(p1.test(7));
    System.out.println("-- predicateAnd --");
    predicateAnd();
    System.out.println("-- predicateOr --");
    predicateOr();
    System.out.println("-- negate --");
    negate();
  }

  public static void predicateAnd() {
    System.out.println(p1.and(p2).test(10));
    System.out.println(p1.and(p2).test(9));
  }

  public static void predicateOr() {
    System.out.println(p1.or(p2).test(10));
    System.out.println(p1.or(p2).test(8));
  }

  public static void negate() {
    System.out.println(p1.or(p2).negate().test(10));
    System.out.println(p1.or(p2).negate().test(8));
  }
}

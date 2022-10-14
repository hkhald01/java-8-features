package com.learnjava.java8features.lambdas;

public class RunnableLambdaExample {

  /** @param args */
  /** @param args */
  /** @param args */
  public static void main(String[] args) {

    //  Prior to Java 8
    Runnable runnable =
        new Runnable() {
          @Override
          public void run() {
            System.out.println("Inside Runnbale 1");
          }
        };
    new Thread(runnable).start();

    // java 8 lambda

    Runnable runnableLambdas = () -> System.out.println("Inside Runnable 2");

    new Thread(runnableLambdas).start();

    Runnable runnableLambdas1 =
        () -> {
          System.out.println("Inside Runnable 3");
          System.out.println("Inside Runnable 3.1");
        };

    new Thread(runnableLambdas1).start();

    new Thread(() -> System.out.println("Insode Runnable 4")).start();

    new Thread(
            new Runnable() {
              @Override
              public void run() {
                System.out.println("InsideRunnable 4.1 prior to java 8");
              }
            })
        .start();
  }
}

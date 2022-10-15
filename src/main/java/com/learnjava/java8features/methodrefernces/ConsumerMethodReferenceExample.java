package com.learnjava.java8features.methodrefernces;

import java.util.function.Consumer;

import com.learnjava.java8features.data.Student;
import com.learnjava.java8features.data.StudentDataBase;

public class ConsumerMethodReferenceExample {

  static Consumer<Student> consumerLambda = (c) -> System.out.println(c);
  static Consumer<Student> consumerLambdaMethodReference = System.out::println;

  static Consumer<Student> consumer = Student::printListOfActivities;

  public static void main(String[] args) {

    StudentDataBase.getAllStudents().forEach(consumerLambda);

    System.out.println("------- --consumerLambdaMethodReference---- ------");

    StudentDataBase.getAllStudents().forEach(consumerLambdaMethodReference);

    System.out.println("------- ---printListOfActivities--- ------");

    StudentDataBase.getAllStudents().forEach(consumer);
  }
}

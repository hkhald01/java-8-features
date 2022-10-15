package com.learnjava.java8features.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.learnjava.java8features.data.Student;
import com.learnjava.java8features.data.StudentDataBase;

public class BiConsumerExample {

  public static void main(String[] args) {
    BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + " , b: " + b);
    biConsumer.accept("Java7", "Java 8");

    BiConsumer<Integer, Integer> multiply =
        (a, b) -> System.out.println("Multiplication is: " + (a * b));
    multiply.accept(2, 4);

    BiConsumer<Integer, Integer> divide =
        (a, b) -> System.out.println("Division is: " + ((double) a / (double) b));
    divide.accept(9, 2);

    nameAndActivites();
  }

  public static void nameAndActivites() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    BiConsumer<String, List<String>> biConsumer =
        (name, activities) -> System.out.println(name + " : " + activities);
    studentList.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
  }
}

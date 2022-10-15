package com.learnjava.java8features.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learnjava.java8features.data.Student;
import com.learnjava.java8features.data.StudentDataBase;

public class ConsumerExample {

  static Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
  static Consumer<Student> cs = (student) -> System.out.println(student.toString());
  static Consumer<Student> cName = (student) -> System.out.print(student.getName());
  static Consumer<Student> cActivities = (student) -> System.out.println(student.getActivities());

  public static void main(String[] args) {

    c1.accept("java8");

    System.out.println("\n-------printStudents--------\n");
    printStudents();
    System.out.println("\n-------printNameAndActivities--------\n");
    printNameAndActivities();
    System.out.println("\n--printNameAndActivitiesUsingConditions---\n");
    printNameAndActivitiesUsingConditions();
  }

  public static void printStudents() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(cs);
  }

  public static void printNameAndActivities() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(cName.andThen(cActivities));
  }

  public static void printNameAndActivitiesUsingConditions() {

    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(
        (student) -> {
          if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
            cName.andThen(cActivities).accept(student);
          }
        });
  }
}

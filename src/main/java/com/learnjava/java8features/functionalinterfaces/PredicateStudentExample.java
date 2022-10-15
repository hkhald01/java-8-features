package com.learnjava.java8features.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learnjava.java8features.data.Student;
import com.learnjava.java8features.data.StudentDataBase;

public class PredicateStudentExample {

  static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
  static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

  public static void main(String[] args) {

    System.out.println("\n-- filterStudentsByGradeLevel --\n");
    filterStudentsByGradeLevel();
    System.out.println("\n-- filterStudentsByGpa--\n");
    filterStudentsByGpa();
    System.out.println("\n-- filterStudents--\n");
    filterStudents();
  }

  public static void filterStudentsByGradeLevel() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(
        (s) -> {
          if (p1.test(s)) {
            System.out.println(s);
          }
        });
  }

  public static void filterStudentsByGpa() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(
        (s) -> {
          if (p2.test(s)) {
            System.out.println(s);
          }
        });
  }

  public static void filterStudents() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(
        (s) -> {
          if (p1.and(p2).negate().test(s)) {
            System.out.println(s);
          } else {
            System.out.println(s);
          }
        });
  }
}

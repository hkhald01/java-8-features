package com.learnjava.java8features.methodrefernces;

import java.util.function.Predicate;

import com.learnjava.java8features.data.Student;
import com.learnjava.java8features.data.StudentDataBase;

public class RefactorMethodReferenceExample {

  static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThenGradeLevel;

  public static boolean greaterThenGradeLevel(Student s) {
    return s.getGradeLevel() >= 3;
  }

  public static void main(String[] args) {

    System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
  }
}

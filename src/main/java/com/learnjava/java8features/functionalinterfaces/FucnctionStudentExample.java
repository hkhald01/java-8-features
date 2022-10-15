package com.learnjava.java8features.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learnjava.java8features.data.Student;
import com.learnjava.java8features.data.StudentDataBase;

public class FucnctionStudentExample {

  static Function<List<Student>, Map<String, Double>> studentFunction =
      (students -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(
            s -> {
              if (PredicateStudentExample.p1.test(s)) {
                studentGradeMap.put(s.getName(), s.getGpa());
              }
            });
        return studentGradeMap;
      });

  public static void main(String[] args) {
    System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    System.out.println(Function.identity());
  }
}

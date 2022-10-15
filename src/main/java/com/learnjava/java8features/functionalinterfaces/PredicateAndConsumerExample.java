package com.learnjava.java8features.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnjava.java8features.data.Student;
import com.learnjava.java8features.data.StudentDataBase;

public class PredicateAndConsumerExample {

  static Predicate<Student> studentPredicate1 = (student) -> student.getGradeLevel() >= 3;
  static Predicate<Student> studentPredicate2 = (student) -> student.getGpa() >= 3.9;

  static BiPredicate<Integer, Double> studentBiPredicate =
      (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

  static BiConsumer<String, List<String>> studentBiConsumer =
      (name, activities) -> System.out.println((name + " : " + activities));

  static Consumer<Student> studentConsumer =
      (student) -> {
        if (studentPredicate1.and(studentPredicate2).test(student)) {
          studentBiConsumer.accept(student.getName(), student.getActivities());
        }
      };

  static Consumer<Student> studentConsumerBiPredicate =
      (student) -> {
        if (studentBiPredicate.test(student.getGradeLevel(), student.getGpa())) {
          studentBiConsumer.accept(student.getName(), student.getActivities());
        }
      };

  public static void main(String[] args) {

    List<Student> studentList = StudentDataBase.getAllStudents();
    new PredicateAndConsumerExample().printNameAndActivities(studentList);
  }

  public void printNameAndActivities(List<Student> studentList) {
    //    studentList.forEach(studentConsumer);
    studentList.forEach(studentConsumerBiPredicate);
  }
}

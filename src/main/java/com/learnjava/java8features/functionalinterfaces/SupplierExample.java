package com.learnjava.java8features.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learnjava.java8features.data.Student;
import com.learnjava.java8features.data.StudentDataBase;

public class SupplierExample {

  public static void main(String[] args) {

    Supplier<Student> studentSupplier =
        () ->
            new Student(
                "Adam", 2, 3.6, "male", 10, Arrays.asList("swimming", "basketball", "volleyball"));
    Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

    System.out.println("Student is : " + studentSupplier.get());
    System.out.println("Student list is : " + listSupplier.get());
  }
}

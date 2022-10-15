package com.learnjava.java8features.data;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  private String name;
  private int gradeLevel;
  private double gpa;
  private String gender;
  private int noteBooks;
  List<String> activities = new ArrayList<>();

  public Student(String name) {
    this.name = name;
  }

  public void printListOfActivities() {
    System.out.println(activities);
  }
}

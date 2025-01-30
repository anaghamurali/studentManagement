package com.student;

import java.util.*;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private Set<String> courses;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.courses = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void enrollCourse(String course) {
            courses.add(course);
        
    }

    public void printStudentInfo() {

        System.out.println("Student details");
        System.out.println("Name : " + name);
        System.out.println("ID : " + studentId);
        System.out.println("Age : " + age);
        System.out.println("Courses : " + courses);
        System.out.println();
    }

}

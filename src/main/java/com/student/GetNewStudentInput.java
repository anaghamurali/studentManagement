package com.student;

import java.util.List;
import java.util.Scanner;

public class GetNewStudentInput {

    //Add students from console input

    public static void addnewStudent(int numberOfStudents, Scanner sc, List<Student> students) {
        // TODO Auto-generated method stub

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the student name:");
            String name = sc.nextLine();


            System.out.println("Enter the student age:");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the student id:");
            String id = sc.nextLine();

            Student studentNew = new Student(name, age, id);
            students.add(studentNew);

            System.out.println("Enter the number of courses for " + name + " :");
            int courseCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < courseCount; j++) {

                System.out.println("Enter the course " + (j + 1) + " :");
                String course =sc.nextLine();
                studentNew.enrollCourse(course);

            }

        }
    }
}

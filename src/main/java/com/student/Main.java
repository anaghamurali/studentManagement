package com.student;

import java.util.*;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {

        //Adding student details via constructor
        Student student1 = new Student("Ann", 20, "10");
        Student student2 = new Student("Ann", 19, "14");
        Student student3 = new Student("Sam", 21, "12");

        List<String> courses = new ArrayList<>();

        courses = Arrays.asList("English", "Maths", "Science", "Physics", "Chemistry", "Biology", "Geography",
                "History", "ComputerScience",
                "AI", "DataScience", "Advanced English", "Advanced Maths", "Advanced Science", "Advanced Physics",
                "Advanced Chemistry", "Advanced Biology", "Advanced Geography", "Advanced History",
                "Advanced ComputerScience", "Advanced AI", "Advanced DataScience", "IOT");

        //Adding the available classes to respective students

        for (String course : courses) {
            student1.enrollCourse(course);
            student2.enrollCourse(course);
            student3.enrollCourse(course);
        }

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        //Sorting the students based on name and age

        SearchandSortStudent.sortStudents(students);

        //printing the students

        for (Student student : students) {
            student.printStudentInfo();
        }
    

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();

        //Adding new students via console
        GetNewStudentInput.addnewStudent(numberOfStudents, sc, students);

        System.out.println("Enter the ID of student to be searched");
        String studentId = sc.nextLine();
        sc.close();

        try {

            Student searchedStudent = SearchandSortStudent.findStudentById(students, studentId);
            System.out.println("Student found :" + searchedStudent.getName());
            searchedStudent.printStudentInfo();
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}

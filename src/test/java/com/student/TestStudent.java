package com.student;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TestStudent {
     // Test for Student creation
    @Test
    public void testStudentCreation() {
        Student student = new Student("Ann", 20, "10");

        assertEquals("Ann", student.getName());
        assertEquals(20, student.getAge());
        assertEquals("10", student.getStudentId());
        assertTrue(student.getCourses().isEmpty());
    }

    @Test
    public void testEnrollCourse() {
        Student student = new Student("Ann", 20, "10");

        student.enrollCourse("Maths");
        assertEquals(1, student.getCourses().size());
        assertTrue(student.getCourses().contains("Maths"));
    }

    // Test trying to enroll in the same course again
    @Test
    public void testEnrollSameCourse() {
        Student student = new Student("Ann", 20, "10");

        student.enrollCourse("Maths");
        student.enrollCourse("Maths");

        assertEquals(1, student.getCourses().size());
    }

     // Test for searching student
    @Test
    public void testFindStudentByIdSuccess() throws StudentNotFoundException {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ann", 20, "10");
        students.add(student1);

        Student foundStudent = SearchandSortStudent.findStudentById(students, "10");
        assertNotNull(foundStudent);
        assertEquals("Ann", foundStudent.getName());
    }

    // Test for searching student - invalid id
    @Test
    public void testFindStudentByIdFailure() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ann", 20, "10");
        students.add(student1);

        assertThrows(StudentNotFoundException.class, () -> {
            SearchandSortStudent.findStudentById(students, "999"); // Non-existing student
        });
    }

    // Testing userinput class
    @Test
    public void testAddNewStudent() {
        // Simulate user input using ByteArrayInputStream
        String simulatedInput = "Ann\n20\n10\n2\nMaths\nScience\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner sc = new Scanner(inputStream);

        List<Student> students = new ArrayList<>();

        // Call method to add a new student
        GetNewStudentInput.addnewStudent(1, sc, students); // Add one student

        // Assertions to check if the student was added correctly
        assertEquals(1, students.size());
        Student addedStudent = students.get(0);
        assertEquals("Ann", addedStudent.getName());
        assertEquals(20, addedStudent.getAge());
        assertEquals("10", addedStudent.getStudentId());
        assertEquals(2, addedStudent.getCourses().size());
        assertTrue(addedStudent.getCourses().contains("Maths"));
        assertTrue(addedStudent.getCourses().contains("Science"));
    }

    // Testing StudentNotFoundException
    @Test
    public void testStudentNotFoundException() {
        String studentId = "999";
        StudentNotFoundException exception = new StudentNotFoundException(studentId);

        assertEquals("student with ID " + studentId + " is not found", exception.getMessage());
    }





}

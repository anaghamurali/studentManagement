package com.student;

//Custom Exception
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String studentId) {
        super("student with ID " + studentId + " is not found");
    }

}

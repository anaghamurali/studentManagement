package com.student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchandSortStudent {

    //Search student with the help of ID

    public static Student findStudentById(List<Student> students, String studentId) throws StudentNotFoundException {
        for (Student student : students) {

            if (student.getStudentId().equals(studentId)) {
                return student;

            }

        }
        throw new StudentNotFoundException(studentId);
    }

    //Sort students with the help of Name and Age
    public static void sortStudents(List<Student> students) {

        Collections.sort(students, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                int namecomparison = s1.getName().compareTo(s2.getName());

                if (namecomparison == 0) {
                    return Integer.compare(s1.getAge(), s2.getAge());
                }

                return namecomparison;

            }

        });
    }

}

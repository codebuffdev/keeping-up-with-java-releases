package in.codebuffdev.release.java8.features.streams.se.foundations;

// Print the 1st 2 students from the list of students whose age is less than 25

import in.codebuffdev.release.java8.features.streams.se.model.Student;

public class Intro_06 {
    public static void main(String[] args) {
        Student.getStudentsList().stream()
                .filter(student -> student.getAge() < 25)
                .limit(2)
                .forEach(student -> System.out.println(student.getName()));
    }
}

package in.codebuffdev.release.java8.features.streams.foundations;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
class Student{
    int id;
    String name;
}

public class Intro_03 {
    public static void main(String[] args) {
        Student s1 = Student.builder().id(1).name("a").build();
        Student s2 = Student.builder().id(11).name("b").build();
        Student s3 = Student.builder().id(111).name("c").build();

        List<Student> studentList = List.of(s1,s2,s3);
        studentList.stream().forEach(System.out::println);
    }
}

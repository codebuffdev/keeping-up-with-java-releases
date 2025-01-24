package in.codebuffdev.release.java8.features.streams.se.model;

import lombok.*;

import java.util.List;

@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Student {
    private int id;
    private String name;
    private int age;

    public static List<Student> getStudentsList(){
        return List.of(
                Student.builder().id(1).name("John").age(20).build(),
                Student.builder().id(2).name("Jane").age(26).build(),
                Student.builder().id(3).name("Doe").age(24).build(),
                Student.builder().id(4).name("Doe").age(23).build(),
                Student.builder().id(5).name("Doe").age(28).build()
        );
    }
}

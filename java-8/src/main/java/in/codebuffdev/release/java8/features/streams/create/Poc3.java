package in.codebuffdev.release.java8.features.streams.create;

import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Poc3 {
    public static void main(String[] args) {
        Student studSp = new Student("Sp", 18);
        Student studNp = new Student("Np", 18);
        Student studXp = new Student("Xp", 18);
        Student studZp = new Student("Zp", 18);

        List<Student> studentList = Arrays.asList(studSp, studNp, studXp, studZp);
        studentList.forEach(System.out::println);
    }
}

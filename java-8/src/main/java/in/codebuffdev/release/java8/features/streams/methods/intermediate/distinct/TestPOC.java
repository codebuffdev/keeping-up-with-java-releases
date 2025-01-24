package in.codebuffdev.release.java8.features.streams.methods.intermediate.distinct;

import java.util.Arrays;
import java.util.List;

public class TestPOC {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "A", "B", "C", "D", "E", "F", "G", "E", "F", "H", "I", "J", "K", "L", "M", "N", "O");

        // distinct() stateful intermediate operations
        list.stream().distinct().forEach(System.out::println);
    }
}

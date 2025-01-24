package in.codebuffdev.release.java8.features.streams.methods.intermediate.skip;

import java.util.stream.Stream;

public class TestPOC {
    public static void main(String[] args) {
        // skip() intermediate method is used to skip the first n elements of the stream.
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .skip(5) // skip 1st n number of the stream (stateful)
                .forEach(System.out::println);
    }
}

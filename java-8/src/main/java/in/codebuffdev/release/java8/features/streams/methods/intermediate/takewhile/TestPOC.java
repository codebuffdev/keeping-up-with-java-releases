package in.codebuffdev.release.java8.features.streams.methods.intermediate.takewhile;

import java.util.stream.Stream;

public class TestPOC {
    public static void main(String[] args) {
        //takeWhile(): is used to return a stream consisting of the elements of this stream, taken
        //stateful method
        Stream.of(1, 2, 3, 4, 5, 6, 7, 3, 9, 10)
                .takeWhile(i -> i < 5) // stateful short circuiting operations
                .forEach(System.out::println);
    }
}

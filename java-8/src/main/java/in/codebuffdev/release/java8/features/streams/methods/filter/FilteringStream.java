package in.codebuffdev.release.java8.features.streams.methods.filter;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilteringStream {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> integerStream = Arrays.stream(numbers);

        Stream<Integer> filterStream = integerStream.filter(number -> number > 5);
        filterStream.forEach(number -> System.out.println("number = " + number));
    }
}

package in.codebuffdev.release.java8.features.streams.se.foundations;

import java.util.Arrays;

public class Intro_05_map {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(integers)
                .filter(integer -> integer > 5)
                .map(integer -> integer * 2)
                .forEach(System.out::println);
    }
}

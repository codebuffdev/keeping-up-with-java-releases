package in.codebuffdev.release.java8.features.streams.se.foundations;

import java.util.stream.Stream;

public class Intro_02_StreamOf {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.forEach(System.out::println);
    }

}
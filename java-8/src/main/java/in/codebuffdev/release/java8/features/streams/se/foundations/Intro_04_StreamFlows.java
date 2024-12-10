package in.codebuffdev.release.java8.features.streams.se.foundations;

import java.util.Arrays;
import java.util.stream.Stream;

public class Intro_04_StreamFlows {

    public static void main(String[] args) {
        // datasource
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> integerStream = Arrays.stream(integers); // immutable

        // filter intermediate operations
        integerStream.peek(number -> System.out.println("Peek the number " + number)).filter(integer -> {
            System.out.println("Apply filter condition on number " + integer);
            return integer > 5;
        }).forEach(num -> {
            System.out.print("forEach() Printing number ");
            System.out.println(num);
        });
    }

}
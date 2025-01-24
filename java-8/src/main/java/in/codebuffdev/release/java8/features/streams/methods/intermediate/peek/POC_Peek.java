package in.codebuffdev.release.java8.features.streams.methods.intermediate.peek;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class POC_Peek {

    public static void main(String[] args) {
        Integer integer[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> integerStream = Arrays.stream(integer);

        integerStream.peek((integer1) -> {
            System.out.println("Peeking into = " + integer1);
        }).forEach(integer1 -> System.out.println("Printing " + integer1));
    }

}

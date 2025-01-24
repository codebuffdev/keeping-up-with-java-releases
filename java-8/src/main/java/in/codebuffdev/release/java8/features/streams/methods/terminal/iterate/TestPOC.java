package in.codebuffdev.release.java8.features.streams.methods.terminal.iterate;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class TestPOC {
    public static void main(String[] args) {

        // Stream.iterate() method
        Stream<Integer> integerStream = Stream.iterate(0, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 2;
            }
        });

        integerStream
                .limit(30)
                .forEach(System.out::println);

        // Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);

    }
}

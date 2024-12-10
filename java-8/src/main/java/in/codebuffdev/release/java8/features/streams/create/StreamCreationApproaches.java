package in.codebuffdev.release.java8.features.streams.create;

import java.util.List;
import java.util.stream.Stream;

public class StreamCreationApproaches {
    public static void main(String[] args) {
        // emptyStream().forEach(p -> System.out.print(p + " "));
        // createWithStreamOf().forEach(p -> System.out.print(p + " "));
        // createWithStreamBuilder().forEach(p -> System.out.print(p + " "));
        createStream().forEach(p -> System.out.print(p + " "));
    }

    // approach1: empty stream
    public static Stream<Object> emptyStream() {
        return Stream.empty();
    }

    // approach2 : Stream.Of()
    public static Stream<Integer> createWithStreamOf() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    // approach3: Stream.builder()
    public static Stream<String> createWithStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.add("a");
        builder.add("b");
        builder.add("c");
        builder.add("d");
        builder.add("e");

        // build a Stream
        return builder.build();
    }

    // approach4: object push into Stream
    public static Stream<Integer> createStream() {
        List<Integer> integers = List.of(1, 2, 3, 4, 56, 7, 8);
        return integers.stream();
    }
}

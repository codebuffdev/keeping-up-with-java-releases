package in.codebuffdev.release.java8.features.streams.methods.intermediate.sort;

import java.util.stream.Stream;

public class POC {
    public static void main(String[] args) {
        Stream
                .of(22, 443342, 122, 1)
                .peek(i -> System.out.println("Peeking: " + i))
                // stateless intermediate operation
                .filter(i -> {
                    System.out.println("Filtering: " + i);
                    return true;
                })
                //stateful intermediate operation
                .sorted()
                .peek(i -> System.out.println("Peeking: " + i))
                .forEach(System.out::println);
    }
}

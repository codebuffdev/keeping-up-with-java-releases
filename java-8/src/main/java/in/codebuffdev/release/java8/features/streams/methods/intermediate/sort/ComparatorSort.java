package in.codebuffdev.release.java8.features.streams.methods.intermediate.sort;

import java.util.Comparator;
import java.util.stream.Stream;

public class ComparatorSort {
    public static void main(String[] args) {
        Stream.of(22, 443342, 122, 1)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}

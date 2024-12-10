package in.codebuffdev.release.java8.features.streams.create;

import java.util.stream.Stream;

public class Poc2 {
    public static void main(String[] args) {
        //  Stream.of -> datasource
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerStream.forEach(s-> System.out.println(" "+s+ " "));
    }
}

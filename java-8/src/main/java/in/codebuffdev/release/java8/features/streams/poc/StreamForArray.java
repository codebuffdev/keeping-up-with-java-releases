package in.codebuffdev.release.java8.features.streams.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
 * resource:durgaSir*/
public class StreamForArray {
    public static void main(String[] args) {
        String[] fruits = {"apple","orange","pineapple","grapes"};
        Stream<String> fruits1 = Stream.of(fruits);
        fruits1.forEach(obj-> System.out.println(obj));

        IntStream stream = Arrays.stream(new int[]{10, 20, 30, 40, 5});
        stream.forEach(obj-> System.out.println(obj));

    }
}

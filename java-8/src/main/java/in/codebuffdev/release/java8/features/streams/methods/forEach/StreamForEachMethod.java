package in.codebuffdev.release.java8.features.streams.methods.forEach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamForEachMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

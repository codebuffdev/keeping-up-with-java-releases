package in.codebuffdev.release.java8.features.streams.methods.intermediate.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterName {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("anshu", "sriman", "durga", "hk", "natu");
        stringStream.filter(name -> name.length() >= 5 && name.length() <= 6).forEach(System.out::println);

        Stream<String> stringStream1 = Stream.of(null, "Anshu", "Sriman", "Raghu", null);
        List<String> nameList = stringStream1.filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(nameList);


    }
}

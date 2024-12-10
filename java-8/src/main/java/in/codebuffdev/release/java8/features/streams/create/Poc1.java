package in.codebuffdev.release.java8.features.streams.create;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Poc1 {
    public static void main(String[] args) {

        // Stream.generate() -> acts as a datasource, keep on generating the value given by the supplier

        Supplier<String> stringSupplier = () -> "Hello Streams";
        Stream<String> generatedStreamOfString = Stream.generate(stringSupplier);

        Consumer<String> stringConsumer = (eachString) -> System.out.println("stringSupplier = " + eachString);
        generatedStreamOfString.forEach(stringConsumer);
    }
}

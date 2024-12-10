package in.codebuffdev.release.java8.features.streams.se.foundations;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Intro_01_GenerateStreams {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello streams";
            }
        };

        // datasource
        Stream<String> streamOfString = Stream.generate(stringSupplier);

        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("str = " + s);
            }
        };

        streamOfString.forEach(stringConsumer);
    }
}

package in.codebuffdev.release.java8.features.streams.foundations;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Intro_02_GenerateStreams {
    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger();

        // Datasource of Integer
        Supplier<Integer> integerSupplier = new Supplier<>() {
            @Override
            public Integer get() {
                return atomicInteger.incrementAndGet();
            }
        };

        Stream<Integer> integerStream = Stream.generate(integerSupplier).limit(200);

        Consumer<Integer> consumer = new Consumer<Integer>(){
            @Override
            public void accept(Integer o) {
                System.out.println("Consumed "+o);
            }
        };

        integerStream.forEach(consumer);
    }
}

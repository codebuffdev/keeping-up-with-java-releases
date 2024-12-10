package in.codebuffdev.release.java8.features.streams.poc;

import java.util.stream.Stream;

public class EgSimpleStreams {
    public static void main(String[] args) {
        //creating stream object
        Stream<Integer> integerStream = Stream.of(10, 20, 40);
//        integerStream.forEach(val-> System.out.println(val));
        integerStream.forEach(EgSimpleStreams::show);

        System.out.println("-----------------");

        //create Stream for array
        Stream<Integer> integerStream2 = Stream.of(new Integer[]{10, 20, 30, 40, 50});
//        integerStream2.forEach(val-> System.out.println(val));
        integerStream2.forEach(EgSimpleStreams::show);
    }

    public static void show(Integer val) {
        System.out.println(val);
        System.out.println("show() has been called ");
    }
}

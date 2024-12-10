package in.codebuffdev.release.java8.features.fi;

import java.util.function.Consumer;

/**
 * @coder: codebuffdev
 * Takes an input & performs an operation on it, doesn't return any value.
 */

public class ConsumerPOC {
    public static void main(String[] args) {
        Consumer<String> c1 = (str) -> {
            System.out.println(str.length());
        };
        Consumer<Integer> c2 = (i) -> {
            System.out.println(i * 2);
        };

//		c1.accept("durga");
//		c2.accept(98776);

        Consumer<String> c3 = str -> System.out.println(str.toUpperCase());
//      c1.andThen(c3).accept("Sriman");

        Consumer<String> cc = c1.andThen(c3);
        cc.accept("durga");


    }
}

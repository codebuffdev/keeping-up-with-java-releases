package in.codebuffdev.release.java8.features.fi;

import java.util.function.Function;

/**
 *
 */

public class FunctionPOC {
    public static void main(String[] args) {
        // TODO: Write code here
        Function<Integer, String> integerToStringConverter =
                (integer) -> String.valueOf(integer);
        String convertedString = integerToStringConverter.apply(10);
    }
}

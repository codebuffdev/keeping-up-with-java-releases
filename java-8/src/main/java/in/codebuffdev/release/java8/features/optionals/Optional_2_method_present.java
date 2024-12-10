package in.codebuffdev.release.java8.features.optionals;

import java.util.Optional;
import java.util.function.Consumer;

public class Optional_2_method_present {
    public static void main(String[] args) {
        Optional<Boolean> aBoolean =  Optional.of(false);
        // isPresent(): Returns true if the Optional contains a value, false otherwise.
        if (aBoolean.isPresent()) {
            // get(): Returns the value contained in the Optional object, or throws a NoSuchElementException if the Optional object is empty.
            System.out.println("aBoolean = " + aBoolean.get());
        }
        else {
            System.out.println("false condition = " + aBoolean);
        }

        //ifPresent(consumer): Performs the given action on the value in the Optional object, if it is present.
        Optional<String> string = Optional.of("string");
        Consumer consumer = (name) -> System.out.println(name);
        aBoolean.ifPresent(consumer);

    }
}

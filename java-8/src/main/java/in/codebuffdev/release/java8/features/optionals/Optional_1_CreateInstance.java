package in.codebuffdev.release.java8.features.optionals;

import java.util.Optional;

// Once an Optional is created, its value cannot be changed.

public class Optional_1_CreateInstance {
    public static void main(String[] args) {
        //Creates an empty Optional object. We cannot add a value to an empty Optional.
        Optional<Object> empty = Optional.empty();

        // Creates an Optional object containing the given value.
        Optional<Boolean> aBoolean = Optional.of(true);

        // Creates an Optional object containing the given value, or an empty Optional object if the value is null.
        Optional<Object> objectOptional = Optional.ofNullable(null);
    }
}

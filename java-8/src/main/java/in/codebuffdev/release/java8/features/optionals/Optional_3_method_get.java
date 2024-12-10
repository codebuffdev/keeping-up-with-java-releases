package in.codebuffdev.release.java8.features.optionals;

import java.util.Optional;

public class Optional_3_method_get {
    public static void main(String[] args) {
        // get(): Returns the value in Optional, or throws a NoSuchElementException in case Optional is empty.
        Optional<Object> objectOptional = Optional.ofNullable(null);
        Object obj = objectOptional.get();
        System.out.println("obj = " + obj); // java.util.NoSuchElementException
    }
}

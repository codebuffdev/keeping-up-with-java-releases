package in.codebuffdev.release.java8.features.optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Optional_4_method_orElse {
    public static void main(String[] args) {
        // orElse(value): Returns the value in the Optional object, or the given default value if the Optional object is empty.
        Optional<Object> objectOptional = Optional.ofNullable(null);
        //System.out.println(objectOptional.get()); //java.util.NoSuchElementException
        System.out.println(objectOptional.orElse(false));

        // orElseGet(supplier): Returns the value in the Optional object, or the value returned by the given supplier if the Optional object is empty.
        Supplier supplier = ()-> false;
        System.out.println(objectOptional.orElseGet(supplier));
    }
}

package in.codebuffdev.release.java8.features.optionals;

import java.util.Optional;

public class Optional_5_methods {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("hello");
        Optional<String> uppercaseName = name.map(String::toUpperCase);
        System.out.println("uppercaseName = " + uppercaseName);

        Optional<String> names = Optional.ofNullable("John Doe");
        boolean isJohnDoe = names.filter(nm -> nm.equals("John Doe")).isPresent();
        System.out.println("isJohnDoe = " + isJohnDoe);
    }
}

package in.codebuffdev.release.java8.features.optionals;

import java.util.Optional;

public class Optional_6_ReturnOptional {
    public static void main(String[] args) {
        Optional<Boolean> optional = getOptional("  ");
        System.out.println(optional.get());
    }
    public static Optional<Boolean> getOptional(String hello){
        if (hello.trim().length() <= 3){
            return Optional.of(false);
        }
        return Optional.of(true);
    }
}

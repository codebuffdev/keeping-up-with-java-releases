package in.codebuffdev.release.java8.features.reference.refmethod;

import java.util.Objects;
import java.util.function.BiPredicate;

public class BiPredicateMethodRef {
    public static void main(String[] args) {
        BiPredicate<String,String> ref = Objects::equals;
        boolean res = ref.test("Hello", "World");
        System.out.println("res = " + res);
    }
}

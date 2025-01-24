package in.codebuffdev.release.java8.features.reference.refmethod;

import java.util.function.BiFunction;

public class BiFunctionMethodRef {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = Integer::sum;
        Integer applied = biFunction.apply(10, 20);
        // System.out.println("applied value = " + applied);

        BiFunction<Integer,Integer,Integer> biFunctionMul = BiFunctionMethodRef::multiply;
        Integer mulApplied = biFunctionMul.apply(10, 20);
        System.out.println("mulApplied = " + mulApplied);
    }

    //2 integer multiplication
    public static Integer multiply(Integer a, Integer b) {
        return a * b;
    }

}

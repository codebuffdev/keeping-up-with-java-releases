package in.codebuffdev.release.java8.features.j7vsj8;

/*
 * print sum of 0 to 50
 * */

import java.util.stream.IntStream;

public class Example1SumOfRange {
    public static void main(String[] args) {
        //pre-java7
        int total = 0;
        for (int i = 0; i <= 50; i++) {
            total += i;
        }
        System.out.println(total);

        //post-java8
        int total2 = IntStream.range(0, 50).sum();
        System.out.println(total2);
    }
}

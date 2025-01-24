package in.codebuffdev.release.java8.features.reference.refmethod;

import java.util.*;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10, 5, 8, 3, 1, 6, 9, 4, 2, 7);

        //method reference to a static method
        ISort iSort = Collections::sort;

        iSort.sortAlist(integerList);
        System.out.println("Sorted List using Lambda Expression: " + integerList);

    }
}

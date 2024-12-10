package in.codebuffdev.release.java8.features.j7vsj8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2EliminateDuplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sam","Prince","Bob","Sam");

        //pre-java8
        List<String> uniqueList = new ArrayList<String>();
        for (String name: list) {
            if (!uniqueList.contains(name)) {
                uniqueList.add(name);
            }
        }
        System.out.println(uniqueList);

        //post-java8
        List<String> distinctNames = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNames);
    }
}

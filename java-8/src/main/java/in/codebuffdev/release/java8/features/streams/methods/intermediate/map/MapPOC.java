package in.codebuffdev.release.java8.features.streams.methods.intermediate.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPOC {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("anshu", "sriman", "durga", "pavan");

        //prior to java8
        List<String> uppCaseNm = new ArrayList<>();
        for (String name : nameList) {
            uppCaseNm.add(name.toUpperCase());
        }
        for (String name : uppCaseNm) {
            System.out.println(name);
        }
        System.out.println();

        //post java8
        List<String> upperCaseNameList = nameList.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        upperCaseNameList.forEach(System.out::println);

        //prior to java8
        System.out.println();
        List<Integer> nameLength = new ArrayList<>();
        for (String name : uppCaseNm) {
            nameLength.add(name.length());
        }
        for (Integer nameInteger : nameLength) {
            System.out.println(nameInteger);
        }

        //post java8
        System.out.println();
        upperCaseNameList.stream().map(name -> name.length()).collect(Collectors.toList()).forEach(System.out::println);
    }
}

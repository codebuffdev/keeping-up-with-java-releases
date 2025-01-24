package in.codebuffdev.release.java8.features.streams.methods.terminal.count;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountPOC {
    public static void main(String[] args) {

        List<String> vehicleList = Arrays.asList("car", "bike", "motorcycle", "plane", "bike", "motorcycle", "plane");

        //toSet() we'll get distinct values only
        Set<String> vehicleSet = vehicleList.stream().collect(Collectors.toSet());

        //count() used to count the number of object in the stream

        long vehicleCount = vehicleList.stream().count();
        System.out.println("Number of vehicle available is  " + vehicleCount);

        long count = vehicleSet.stream().count();
        System.out.println("Number of distinct object available is  " + count);
    }
}

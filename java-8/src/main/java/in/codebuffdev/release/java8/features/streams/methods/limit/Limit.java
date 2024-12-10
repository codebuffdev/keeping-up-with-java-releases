package in.codebuffdev.release.java8.features.streams.methods.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @coder:tech.spmaan
 * @resource:pavan-sdet*/
public class Limit {
    public static void main(String[] args) {
        List<String> vehicleList = Arrays.asList("car", "bike", "motorcycle", "plane", "bike", "motorcycle", "plane");
        /*
         * limit(long limitRange) here we can limit the number of object we want to receive/retrieve from the stream, we
         * may get lesser number of objects from stream possible but never over limit will be happened.
         * in list type - limit(long limitRange) always goes in index order like limit(2) , 1st 2 indexed objects will
         *  be  collected.
         * in set type - limit(long limitRange) always goes in any order
         *  */
        vehicleList.stream().limit(3).forEach(System.out::println);
        System.out.println();
        vehicleList.stream().distinct().collect(Collectors.toSet()).stream().limit(2).forEach(System.out::println);
    }
}

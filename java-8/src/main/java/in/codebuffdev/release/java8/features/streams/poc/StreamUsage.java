package in.codebuffdev.release.java8.features.streams.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
/*
 * resource:durgaSir*/
public class StreamUsage {
    public static void main(String[] args) {
        //immutable list created
//        List<Integer> list =  List.of(10,21900,2211,22,99);
//        list.add(21); //UnsupportedOperationException
        List<Integer> list  = new ArrayList<>(Arrays.asList(10,21900,2211,22,99));
                Iterator < Integer > iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(list);
        System.out.println("using stream");
        //stream
        List<Integer> list2  = new ArrayList<>(Arrays.asList(10,21900,2211,22,99));
        List<Integer> collect = list2.stream().filter(obj -> obj % 2 != 0).collect(Collectors.toList());
        System.out.println("filtering odd obj from list " + collect);
    }
}


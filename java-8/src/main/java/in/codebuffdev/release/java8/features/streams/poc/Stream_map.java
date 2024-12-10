package in.codebuffdev.release.java8.features.streams.poc;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
/*
 * resource:durgaSir*/
public class Stream_map {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,2,21,323,554,22,22,11,22,211);
        Set<Integer> collect = list.stream().map(obj -> obj * 2).collect(Collectors.toSet());
        collect.stream().forEach(obj-> System.out.println(obj));
    }
}

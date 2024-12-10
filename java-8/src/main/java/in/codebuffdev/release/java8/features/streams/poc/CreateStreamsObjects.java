package in.codebuffdev.release.java8.features.streams.poc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamsObjects {
    public static void main(String[] args) {
	//create Stream object 
	Stream<String> streamOf = Stream.of("a","b","c");
	System.out.println(streamOf);
	streamOf.forEach(System.out::println);
	
	Stream<String> streamOfSingleVal = Stream.of("A");
	streamOfSingleVal.forEach(System.out::println);
	System.out.println(streamOfSingleVal);

	
	//create Stream objects from sources 
	//source - collection 
	List<String> asList = Arrays.asList("10","20","30","40");
	Stream<String> stream = asList.stream();
	stream.forEach(System.out::println);
	
	//source - array 
	String[] strings = {"corejava","jee","spring","hibernate","rest","boot","project"};
	Stream<String> streamArray= Arrays.stream(strings);
	streamArray.forEach(System.out::println);
    }
}

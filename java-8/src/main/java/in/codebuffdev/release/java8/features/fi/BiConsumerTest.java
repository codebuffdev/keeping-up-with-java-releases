package in.codebuffdev.release.java8.features.fi;

import java.util.function.BiConsumer;

public class BiConsumerTest {
	
	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (str1, str2) -> {
			System.out.println(str1.toUpperCase() + " " + str2.toUpperCase());
		};

		biConsumer.accept("durga", "sriman");
			
		BiConsumer<Integer, Integer> biConsumer2 = (it1, it2) -> {
			System.out.println(it1+it2);
		};
		
		biConsumer2.accept(10, 20);
		
	}

}

package in.codebuffdev.release.java8.features.fi;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> c1 = (str) -> {
			System.out.println(str.length());
		};
		Consumer<Integer> c2 = (i) -> {
			System.out.println(i*2);
		};

//		c1.accept("durga");
//		c2.accept(98776);

		Consumer<String> c3 = str -> System.out.println(str.toUpperCase());
		
		Consumer<String> cc = c1.andThen(c3);
		cc.accept("durga");
		
		c1.andThen(c3).accept("Sriman");
		
		
	}
}

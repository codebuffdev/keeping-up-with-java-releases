package in.codebuffdev.release.java8.features.fi;
import java.util.function.BiFunction;

public class BiFunctionTest {
	public static void main(String[] args) {
		BiFunction<String, Integer, Boolean> biFunction = (str, inter) -> {
			if (str.length() >= inter)
				return true;
			return false;
		};
		System.out.println(biFunction.apply("durga", 5));
	}
}

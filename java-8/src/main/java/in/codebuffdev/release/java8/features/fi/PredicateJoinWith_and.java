package in.codebuffdev.release.java8.features.fi;

import java.util.function.Predicate;

public class PredicateJoinWith_and {
	public static void main(String[] args) {

		Predicate<Integer> p1 = i -> {
			System.out.println("Predicate1 Join");
			return i % 5 == 0;
		};

		Predicate<Integer> p3 = i -> {
			System.out.println("Predicate3 Join ");
			return i % 2 == 0;
		};

		Predicate<Integer> p2 = i -> {
			System.out.println("Predicate2 Join ");
			return (i > 20);
		};

		Integer[] arr = { 10, 20, 26, 30, 39, 40, 50, 77 };
		/*
		 * for (Integer integer : arr) { if (p1.test(integer))
		 * System.out.println(integer); }
		 * 
		 * System.out.println();
		 * 
		 * for (Integer integer : arr) { if (p2.test(integer))
		 * System.out.println(integer); }
		 */

		// join predicate

		/*
		 * System.out.println("joining 2 predicate with and "); for (Integer integer :
		 * arr) { if (p2.and(p1).test(integer)) { System.out.println(integer); } }
		 */
		
		
		System.out.println("multiple Predicate join with and");
		for (Integer integer : arr) {
			if (p2.and(p1).and(p3).test(integer)) {
				System.out.println("Lucky " + integer);				
			}
		}

	}
}

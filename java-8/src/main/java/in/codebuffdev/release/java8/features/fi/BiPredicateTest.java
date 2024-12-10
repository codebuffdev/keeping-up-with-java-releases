package in.codebuffdev.release.java8.features.fi;

import java.util.function.BiPredicate;
public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> biPredicate1 = (i1,i2) ->{
			System.out.println("BiPredicateTest1");
			return ((i1+i2)%2==0);
		};
	
		BiPredicate<Integer,Integer> biPredicate2 = (i1,i2) ->{
			System.out.println("BiPredicateTest2");
			return i1>0 & i2>0;
		};
	
				
//		System.out.println(biPredicate1.test(3,2));
		System.out.println(biPredicate2.and(biPredicate1).test(10, 21));
		System.out.println();
		System.out.println(biPredicate2.and(biPredicate1).test(-1, 22));
		
		
		
	}
}

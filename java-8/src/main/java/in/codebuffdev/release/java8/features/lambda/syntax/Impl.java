//package in.codebuffdev.release.java8.features.lambda.syntax;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//
//import java8features.lambda.realtime.Book;
//
//public class Impl {
//	public static void main(String[] args) {
//		Implementation calculator = (a,b)->{return a+b;};
//		System.out.println(calculator);
//
//		Comparator<Book> comparator = (Book o1, Book o2)-> {
//			return o1.getBookNm().compareTo(o2.getBookNm());
//		};
//
//		Collections.sort(Arrays.asList(new Book(11, "dcidubfii", 2121),new Book(1212, "skabdakb", 7622)), comparator);
//	}
//}
//
//class MyAscendingComparator implements Comparator<Book>{
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		return o1.getBookNm().compareTo(o2.getBookNm());
//	}
//
//}
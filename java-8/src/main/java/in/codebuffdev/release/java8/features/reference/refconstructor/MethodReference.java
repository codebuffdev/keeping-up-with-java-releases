package in.codebuffdev.release.java8.features.reference.refconstructor;

public class MethodReference {
	public static int method1() {
		System.out.println("method reference");
		return 1;
	}
	
	public static void main(String[] args) {
		Interface1 interf1 = () -> {System.out.println("hi");
			return 10;
		};
		System.out.println(interf1.m1());

		Interface1 interf2 = MethodReference::method1;
		System.out.println(interf2.m1());
		System.out.println(interf1);
		System.out.println(interf2);
	}
}

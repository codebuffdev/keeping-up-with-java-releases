package in.codebuffdev.release.java8.features.bifunctionalinterface.defaultinterf;

public interface RI {
	public default void m1() {
		System.out.println("RI.m1()");
	}
}

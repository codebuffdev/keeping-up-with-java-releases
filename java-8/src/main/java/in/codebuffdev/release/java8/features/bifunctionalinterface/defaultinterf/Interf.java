package in.codebuffdev.release.java8.features.bifunctionalinterface.defaultinterf;

public interface Interf {
	public void m1();
	
	//yes we can declare object class method as abstract method In interface 
	public abstract boolean equals(Object obj); // not affected to the class
	public int hashCode();

	/*
	 * as our class already extends Object class - method implementation available
	 * in super class
	 */

	/*
	public default int hashCode() {
		
	}
	
	public static boolean equals(Object obj) {
		
	}
	*/
	
//	we can not override object class method as static or default method

}

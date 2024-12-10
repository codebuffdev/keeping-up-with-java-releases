package in.codebuffdev.release.java8.features.staticinterf;

public class CallInterfaceStaticMethod implements SRI,SLI {
	public static void main(String[] args) {
		/*
		 * by default - interface static method doesnt avaliable to the implementation
		 * class
		 */

//		new CallInterfaceStaticMethod().m1();
//		m1();

		// Interface static method is only can called by Respective interface name
		SRI.m1();
		SLI.m1();
		
	}
}

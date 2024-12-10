package in.codebuffdev.release.java8.features.bifunctionalinterface.defaultinterf;

public class CallInterfaceDefaultMethod implements LI,RI{
	public static void main(String[] args) {
//		new CallInterfaceDefaultMethod().m1();
		new CallInterfaceDefaultMethod().m1();
	}
	
	//solving ambiguity error 
	
	public void m1() {
		LI.super.m1();
		RI.super.m1();
	}
	
}

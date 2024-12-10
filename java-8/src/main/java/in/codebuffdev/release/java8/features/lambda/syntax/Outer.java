package in.codebuffdev.release.java8.features.lambda.syntax;

class SuperOuter {
	public int b = 1;
	public int a = 10;
}

public class Outer extends SuperOuter{
	int b = 10;

	class Inner implements I1 {
//		int b = 100;

		@Override
		public void m1() {
			int b = 1000;
			System.out.println(b); //100
//			System.out.println(this.b);
			System.out.println(Outer.this.b);
			System.out.println(Outer.this.a);
			System.out.println(Outer.super.a);
			System.out.println(Outer.super.b);
			 
		}
	}

	public static void main(String[] args) {
		new Outer().new Inner().m1();
	}
}

package in.codebuffdev.release.java8.features.lambda.syntax;

public class TestExecuteLambdaExpression {
	public static void main(String[] args) {
		
//		Addition addition = (x,y) -> {return x+y;};
		Addition addition = (x,y) -> x+y; //public int add(int x,int y){return x+y;}
		System.out.println(addition);//java8features.lambda.syntax.TestExecuteLambdaExpression$$Lambda$1/531885035@816f27d
	
		int res =  addition.add(10, 20);
		System.out.println(res);
		
		
		TrytPrint print = x -> System.out.println(x);
		System.out.println(print);
		
	}
}


 

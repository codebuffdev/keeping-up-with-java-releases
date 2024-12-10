package in.codebuffdev.release.java8.features.lambda.poc;

interface FuncInter1 {
    int operation(int a, int b);
}

public class MultiParamPOC {
    public static void main(String[] args) {
        FuncInter1 mul = (a, b) -> a * b;
        FuncInter1 add = (a, b) -> a + b;
        System.out.println(mul.operation(5, 3)); // 15
        System.out.println(add.operation(5, 3)); // 8
    }
}

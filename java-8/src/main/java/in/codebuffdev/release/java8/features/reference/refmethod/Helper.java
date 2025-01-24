package in.codebuffdev.release.java8.features.reference.refmethod;

/*
 * Method reference is a special type of Lambda.
 * */

public class Helper {
    public static void main(String[] args) {

        // anonymous inner class
        /*
        ISum iSum = new ISum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        //System.out.println("iSum = " + iSum);
        int sum = iSum.sum(10, 20);
        System.out.println("sum = " + sum);
        */

        // lambda
        ISum iSumLambda = (a, b) -> a + b;
        int sumLambda = iSumLambda.sum(10, 20);
        System.out.println("sumLambda = " + sumLambda);

        // method reference (refer to a method)
        // static method reference (ClassName::methodName)
        ISum iSumMethodReference = Helper::addItems;
        int sumMethodReference = iSumMethodReference.sum(10, 20);
        System.out.println("sumMethodReference = " + sumMethodReference);

        ISum iSumMethodReference2 = Integer::sum;
        int sumMethodReference2 = iSumMethodReference2.sum(10, 20);
        System.out.println("sumMethodReference2 = " + sumMethodReference2);
    }

    public static int addItems(int a, int b) {
        return a + b;
    }
}

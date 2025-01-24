package in.codebuffdev.release.java8.features.reference.refmethod;

public class NonStaticMethodRef {
    public static void main(String[] args) {
        ISum iSum = new NonStaticMethodRef()::add;
        int summed = iSum.sum(10, 20);
        System.out.println("summed = " + summed);
    }

    // add 2 numbers
    public int add(int a, int b) {
        return a + b;
    }
}

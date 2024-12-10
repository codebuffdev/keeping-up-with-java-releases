package in.codebuffdev.release.java8.features.lambda.poc;

/**
 * Java program to demonstrate lambda expressions
 * to implement a user defined functional interface.
 * A sample functional interface (An interface with
 * single abstract method
 * Lambda expression creates an instance of a functional interface
 */

interface FuncInterface {

    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun() {
        System.out.println("Hello");
    }
}

public class POC1 {
    public static void main(String[] args) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fi = x -> System.out.println("Lambda expression: " + (x * x));

        // This calls above lambda expression and prints 10.
        fi.abstractFun(10);
    }
}

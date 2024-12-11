package in.codebuffdev.release.java9.privatemethodsininterface;

// private instance methods will provide code reusability for default methods.
// private instance method

public interface Java9Interf {
    default void m1() {
        m3();
    }

    default void m2() {
        m3();
    }

    private void m3() {
        System.out.println("Common logic for m1 & m2");
    }
}

class Test implements Java9Interf {
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        t.m2();
        //t.m3(); ==> C.Error
    }
}

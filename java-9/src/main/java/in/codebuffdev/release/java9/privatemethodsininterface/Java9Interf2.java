package in.codebuffdev.release.java9.privatemethodsininterface;

// private static method
public interface Java9Interf2 {

    static void m1() {
        m3();
    }

    static void m2() {
        m3();
    }

    private static void m3() {
        System.out.println("Common logic for m1 & m2 : static");
    }

}

class Test2 implements Java9Interf2 {
    public static void main(String[] args) {
         Java9Interf2.m1();
         Java9Interf2.m2();
    }
}


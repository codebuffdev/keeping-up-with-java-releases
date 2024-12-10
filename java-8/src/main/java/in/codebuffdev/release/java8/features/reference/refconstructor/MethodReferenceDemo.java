package in.codebuffdev.release.java8.features.reference.refconstructor;

public class MethodReferenceDemo {
    public static  void m1() {
        System.out.println("Method reference - child");
    }

    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("hi - child");
        };

        Runnable runnable1 =  MethodReferenceDemo::m1;

//      Thread thread = new Thread(runnable);
        Thread thread = new Thread(runnable1);
        thread.start();

        System.out.println("hi - main");
    }
}

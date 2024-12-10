package in.codebuffdev.release.java8.features.fi;

public interface Sayable {
    public void say();
}

class Test {
    public static void main(String[] args) {
        //lambda is an anonymous inner object
        Sayable sayable = () -> {
            System.out.println("Hello lambda");
        };
        System.out.println(sayable);
        sayable.say();
    }
}


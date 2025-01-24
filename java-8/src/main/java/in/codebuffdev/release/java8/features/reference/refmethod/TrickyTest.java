package in.codebuffdev.release.java8.features.reference.refmethod;

interface IUpperCase{
    String toUpperCase(String str);
}

public class TrickyTest {
    public static void main(String[] args) {
        // String uppercase
        // this is a non-static method ? HOW
        IUpperCase iUpperCase = String::toUpperCase;
        String upperCase = iUpperCase.toUpperCase("abc");
        System.out.println("upperCase = " + upperCase);
    }
}

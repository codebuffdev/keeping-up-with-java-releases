package in.codebuffdev.release.java8.features.reference.refmethod;

public class PrintTest {
    public static void main(String[] args) {
        IPrint iPrint = PrintTest::print;
    }

    public static String print(String data) {
        return data;
    }
}
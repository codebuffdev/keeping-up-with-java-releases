package in.codebuffdev.release.java7;

/*
 * Java 1.0 to Java 4: switch supported only int, short, byte, char, and their wrappers.
 * Java 5: Introduced enum types. Enums became a natural fit for switch since they represent a fixed set of constants.
 * Java 7: Added support for String values in switch.
 * */

public class SwitchExp_07_01 {
    public static void main(String[] args) {
        int value = 5;
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}

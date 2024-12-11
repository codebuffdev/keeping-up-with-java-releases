package in.codebuffdev.release.java17;

/**
 * null case
 */

public class SwitchExp_17_03 {
    public static void main(String[] args) {
        System.out.println(guardedPattern(null));
    }

    public static String guardedPattern(Object object) {
        return switch (object) {
            case Integer integer -> "Integer";
            case Employee employee when employee.dept().equals("IT") -> "IT Employee";
            case null -> throw new NullPointerException("Object");
            default -> "Not known type";
        };
    }
}

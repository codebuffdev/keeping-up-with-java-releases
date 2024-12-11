package in.codebuffdev.release.java17;

/**
 * Guarded pattern: conditional statements inside case
 */

public class SwitchExp_17_02 {
    public static void main(String[] args) {
        System.out.println(guardedPattern(Integer.valueOf(10)));
        System.out.println(guardedPattern(new Employee("sp", "IT")));
    }

    public static String guardedPattern(Object object) {
        return switch (object) {
            case Integer integer -> "Integer";
            case Employee employee when employee.dept().equals("IT") -> "IT Employee";
            default -> "Not known type";
        };
    }
}

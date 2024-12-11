package in.codebuffdev.release.java17;

/**
 * Pattern matching
 */

public class SwitchExp_17_01 {
    public static void main(String[] args) {
        System.out.println(whichTypePatternMatching(Integer.valueOf(10)));
        System.out.println(whichTypePatternMatching(new Employee("Sp","IT")));
    }

    public static String whichTypePatternMatching(Object object) {
        return switch (object){
            case Integer integer -> "Integer";
            case Employee employee -> "Employee";
            default -> "Not known type";
        };
    }
}

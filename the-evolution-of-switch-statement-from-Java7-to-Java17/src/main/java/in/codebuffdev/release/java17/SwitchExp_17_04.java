package in.codebuffdev.release.java17;

/**
 * IN guarded pattern matching In pattern matching for switch,
 * when clause allows us to attach a boolean expression to a pattern.
 */

public class SwitchExp_17_04 {
    public static void main(String[] args) {
        System.out.println(checkNumber(10));
        System.out.println(checkNumber(-5));
        System.out.println(checkNumber(0));
    }

    public static String checkNumber(Integer integer) {
        return switch (integer) {
            case Integer integer1 when (integer > 0) -> "It is positive";
            case Integer integer1 when integer == 0 -> "It is 0";
            default -> "It is negative";
        };
    }
}

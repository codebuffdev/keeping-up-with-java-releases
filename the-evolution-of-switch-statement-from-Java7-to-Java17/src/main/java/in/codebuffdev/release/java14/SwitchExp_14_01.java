package in.codebuffdev.release.java14;

/**
 * Multiple Case Labels: standard feature
 */

public class SwitchExp_14_01 {
    public static void main(String[] args) {
        System.out.println(whichDay("Sunday"));
        System.out.println(whichDay("Monday"));
    }

    public static String whichDay(String day) {
        return switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
    }
}

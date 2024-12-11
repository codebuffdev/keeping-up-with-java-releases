package in.codebuffdev.release.java13;

/*
 * yield k.w. allows us to return a value from a `switch` expression in a concise & readable manner.
 */

public class SwitchExp_13_01 {

    public static void main(String[] args) {
        System.out.println(whichDay("Monday"));
    }

    public static String whichDay(String day) {
        return switch (day) {
            case "Monday":
                yield "Weekday";
            case "Tuesday":
                yield "Weekday";
            case "Wednesday":
                yield "Weekday";
            case "Thursday":
                yield "Weekday";
            case "Friday":
                yield "Weekday";
            case "Saturday":
                yield "Weekend";
            case "Sunday":
                yield "Weekend";
            default:
                yield "Unknown";
        };

    }
}

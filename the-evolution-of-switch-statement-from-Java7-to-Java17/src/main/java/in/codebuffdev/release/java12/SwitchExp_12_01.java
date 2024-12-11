package in.codebuffdev.release.java12;

/**
 * Java:12
 * switch block:
 * can return values from a switch block & hence switch statements became switch expressions
 * can have multiple values in a case label
 * can return value from a switch expression through the arrow operator or through the “break” keyword
 */

public class SwitchExp_12_01 {
    public static void main(String[] args) {
       // System.out.println(whichDay("Sunday"));
    }

    /*
    public static String whichDay(String day){
        return  switch (day) {
            case "Monday":
                break "Weekday";
            case "Tuesday":
                break "Weekday";
            case "Wednesday":
                break "Weekday";
            case "Thursday":
                break "Weekday";
            case "Friday":
                break "Weekday";
            case "Saturday":
                break "Weekend";
            case "Sunday":
                break "Weekend";
            default:
                break "Unknown";
        };

    } */
}

// in java this break is changed to yield
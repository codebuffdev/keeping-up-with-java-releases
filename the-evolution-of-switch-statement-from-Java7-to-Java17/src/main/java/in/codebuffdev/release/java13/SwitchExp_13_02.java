package in.codebuffdev.release.java13;

// return value through arrow operator

public class SwitchExp_13_02 {
    public static void main(String[] args) {
        System.out.println(whichDay("Sunday"));
        System.out.println(whichDay("Monday"));
    }

    public static String whichDay(String day){
        return switch (day){
            case "Sunday" -> "Weekend";
            case "Monday" -> "Weekdays";
            case "Tuesday" -> "Weekdays";
            case "Wednesday" -> "Weekdays";
            case "Thursday" -> "Weekdays";
            case "Friday" -> "Weekdays";
            case "Saturday" -> "Weekend";
            default -> throw new IllegalStateException("Pass valid name");
        };
    }
}

package in.codebuffdev.release.java8.features.time;

import java.time.LocalDateTime;

public class DateAndTime {
    public static void main(String[] args) {
        //default time
        var now = LocalDateTime.now();
        System.out.println("now YYYY-MM-DDTHH:MM:SS:milli= " + now);

        //custom time
        var myTime = LocalDateTime.of(1995,11,20,13,20);
        System.out.println("myTime = " + myTime);
    }
}

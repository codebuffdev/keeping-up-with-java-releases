package in.codebuffdev.release.java8.features.time;

import java.time.LocalTime;

public class TimeDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime 24hr hh:mm:ss.mill = " + localTime);

        //operation on local time
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        int nano = localTime.getNano();
        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("second = " + second);
        System.out.println("nano = " + nano);
    }
}

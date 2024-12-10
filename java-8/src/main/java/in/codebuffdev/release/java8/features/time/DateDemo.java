package in.codebuffdev.release.java8.features.time;

import java.time.LocalDate;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Date YYYY-MM-DD = " + localDate);

        //operation on LocalDate
        int dd = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();

        System.out.println("Year = " + year);
        System.out.println("Month = " + month);
        System.out.println("dd = " + dd);
    }
}

package my.pattern;

import java.util.Date;
import java.util.Calendar;

public class DateAndCalendar {
    public static void main(String[] args) {
        Date currentDate = new Date(0);
        System.out.println("Current Date: " + currentDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());



    }
}

package Amigoscode;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {

    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.minusDays(5));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
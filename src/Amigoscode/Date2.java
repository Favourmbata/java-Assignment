package Amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Date2 {

    public static void main(String[] args) {


       LocalDateTime someDate = LocalDateTime.of(
                2000,
                9,
                19,
                14,
                55
        );

        System.out.println(someDate);

      LocalDate someDate2 = LocalDate.of(
              2000,
              Month.SEPTEMBER,
              1

      );

        LocalTime someTime = LocalTime.of(
                12,
                55,
                24
        );
    

    }
}
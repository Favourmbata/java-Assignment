package Chapter6;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter year");
        int year = console.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0);
            System.out.println( year + " is leap year? " + isLeapYear);


        }

    }


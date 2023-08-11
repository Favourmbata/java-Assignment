package MyOwn;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year:");
         int year = scanner.nextInt();

        System.out.println(is_leapYear(year));
    }

    public  static boolean is_leapYear(int year) {
     boolean a = (year % 4)==0;
     boolean b = (year % 100)!= 0;
     boolean c = (year % 100 == 0)&&(year % 400 == 0);
     return  a && (b|| c);
    }
}

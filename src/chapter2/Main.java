package chapter2;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }
    private static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
            System.out.println("sunday");
            break;

            case 1:
         System.out.println("monday");
           break;

            case 2:
             System.out.println("tuesday");
                break;

            case 3:
           System.out.println("wednesday");
             break;

            case 4:
                System.out.println("thursday");
                   break;

                case 5:
                    System.out.println("friday");
                      break;
                     case 6:
                         System.out.println("saturday");
                             break;
                               default:
                                   System.out.println("invalid");
                                     break;

        }

    }



}

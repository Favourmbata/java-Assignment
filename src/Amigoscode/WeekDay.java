package Amigoscode;

import java.util.Scanner;

public class WeekDay {
    public static void calculatingWeek() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day of the week choose 0 to 6");
        int weekDay = input.nextInt();

        while (weekDay > 6){
            System.out.println("Enter day of the week  choose 0 to 6");
            weekDay = input.nextInt();
        }
        switch (weekDay) {
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wedsday");
                break;
            case 4:
                System.out.println("Today is Thurday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is saturday");
                break;
            default:
//                calculatingWeek();

        }
    }

    public static void main(String[] args) {
        calculatingWeek();
    }
}
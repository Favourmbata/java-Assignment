package Jennifer;

import java.util.Scanner;

public class FutureDate {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter todays day");
        int day = console.nextInt();

        System.out.println("Enter future day");
        int futureDay = console.nextInt();

           int total  = (futureDay % 7 )+ day ;

        switch (day){
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

        }

        switch (total){
            case 0:
                System.out.println("The future day is sunday");
                break;
            case 1:
                System.out.println("The future day is monday");
                break;
            case 2:
                System.out.println("The future day is Tuesday");
                break;
            case 3:
                System.out.println("The future day is Wedsday");
                break;
            case 4:
                System.out.println("The future day is Thurday");
                break;
            case 5:
                System.out.println("The future day is Friday");
                break;
            case 6:
                System.out.println("The day is saturday");

        }

    }

}

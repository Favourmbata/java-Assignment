package Chibuzor;

import java.util.Scanner;

public class repeatADoWhil {



        public static void repeat () {

            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("Enter first number");
                int number = input.nextInt();
                System.out.println("Enter second number");
                int number2 = input.nextInt();
                int sum = input.nextInt();
                System.out.println("The sum is " + sum);

                System.out.println("Do you want to perform another operation again? yes / No");
                int response = input.nextInt();


                break;
            }
        }
    }

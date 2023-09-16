package Chibuzor;

import java.util.Scanner;

public class DoWhile {



    public static void addSumAndDisplay(){

        Scanner input = new Scanner(System.in);

           char answer;
        do {
            System.out.println("Enter first number");
            int number1 = input.nextInt();

            System.out.println("Enter second number");
            int number2 = input.nextInt();

            int sum = number1 + number2;
            System.out.println("The sum of numbers :" + sum);

            System.out.println("Do you want to continue yes/no");
             answer = input.next().charAt(0);

        }while (answer == 'y' || answer == 'n');


    }

    public static void main(String[] args) {
        addSumAndDisplay();
    }

}

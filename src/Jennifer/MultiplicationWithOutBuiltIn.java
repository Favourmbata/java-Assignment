package Jennifer;

import java.util.Scanner;

public class MultiplicationWithOutBuiltIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();

         int counter = 0;
         int raisedNumber  = 1;

        for ( counter = 0; counter < number2 ; counter++) {
            raisedNumber = raisedNumber * number1;
        }
        System.out.println(raisedNumber);


        }


    }


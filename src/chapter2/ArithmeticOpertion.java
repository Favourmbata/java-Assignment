package chapter2;

import java.util.Scanner;

public class ArithmeticOpertion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int number1 = input.nextInt();
        System.out.println("enter second number");
        int number2 = input.nextInt();
        System.out.println("enter square of first number");
        int squaredNumber1 = number1 * number2;
        System.out.println("enter the squae of second number");
        int squaredNumber2 = number2 * number1;
        System.out.println("enter the sum of first number");
        int sumedNumber1 = number1 + number2;
        System.out.println("enter the square of second number");
        int sumedNumber2 = number2 + number1;
         int differnceOfSquare = squaredNumber1 - squaredNumber2;
        System.out.println("this is the sum of squared number" );
        System.out.println("his is the difference of of the square"+differnceOfSquare);
    }




}

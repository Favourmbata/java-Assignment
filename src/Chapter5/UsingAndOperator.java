package Chapter5;

import java.util.Scanner;

public class UsingAndOperator {

    public static void usingAndOperator() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Enter an integer");
        if (number % 5 == 0 && number % 6 == 0) {
        }
        System.out.println(number + " is divisible by 5 and 6.");
        if (number % 5 == 0 || number % 6 == 0) {
        }
        System.out.println(number + "is divisible by 5 or 6 : ");
        if (number % 5 == 0 ^ number % 6 == 0) {
        }
        System.out.println(number + "is disible by 5 or 6 ,but not both");
    }



    public static void main(String[] args) {
        usingAndOperator();
    }

}





package Jennifer;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int number = 4;

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial =factorial* i;
            System.out.println("The factorial for number is ->" +number+" factorial " + factorial);
        }



        System.out.println("Enter number of estimate constant->");
        int estimate = input.nextInt();

        int constant = 1;
        for (int i = 1; i < estimate; i++) {

        }
        System.out.println();

    }
}
package Chibuzor;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int count = 1;
        for (int i = 1; i <= number ; i++) {
            count = count * i;
            System.out.println("The factorial of "+number+" is " + "count" + count);
        }

    }
}

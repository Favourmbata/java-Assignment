package Chapter6;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the square of number");

        int number = scanner.nextInt();
        int square = number*number;

        System.out.println("The square of " + number +  " is " +square);

    }
}

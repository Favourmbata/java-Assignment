package Chapter4B;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number % 2 == 0 || number / 2 == 0){
            System.out.println("It is a prime number" );
        }else {
            System.out.println("It is not a prime number " + number);
        }

    }
}

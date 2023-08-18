package Jennifer;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter five number");
        int number = scanner.nextInt();

        int firstNumber = number /10000;

        int secondRemainder = number % 10000;
        int secondNumber = secondRemainder / 1000;

        int thirdRemainder = number % 1000;
        int thirdNumber = thirdRemainder/100;

        int fourthRemainder = number % 100;
        int fourthNumber = fourthRemainder / 10;

        int fifthRemainder = number % 10;
        int fifthNumber = fifthRemainder;

        System.out.printf("%d %d %d %d %d",firstNumber,secondNumber,thirdNumber,fourthNumber,fifthNumber);






    }
}

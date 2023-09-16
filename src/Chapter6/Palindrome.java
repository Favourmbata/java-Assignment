package Chapter6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers");
        int number = scanner.nextInt();

        int reverse = 0;
        int temporaryNumber = number;

        while (temporaryNumber > 0){
            int digit = temporaryNumber % 10;
            reverse = reverse * 10 + digit;
            temporaryNumber /= 10;

        }if (number == reverse){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
}

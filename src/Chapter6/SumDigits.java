package Chapter6;

import java.util.Scanner;

public class SumDigits {

    public static int calculateSumOfDigit(int digits) {
       int sum = 0;
       while (digits > 0){
           sum = sum + digits %10;
           digits /= 10;
       }
        return sum;

    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter four numbers");
        int numbers = console.nextInt();

        System.out.println("The sum is " + calculateSumOfDigit (numbers));
    }
}
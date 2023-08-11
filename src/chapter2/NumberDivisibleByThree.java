package chapter2;

import java.util.Scanner;

public class NumberDivisibleByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = scanner.nextInt();
        if (number % 3 == 0 || number / 3 == 0){
            System.out.println("number is divisible by 3");

        }else {
            System.out.println("number is not divisible by 3");
        }
    }
}

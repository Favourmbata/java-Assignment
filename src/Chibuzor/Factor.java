package Chibuzor;

import java.util.Scanner;

public class Factor {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int factor = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
               factor++;


                System.out.printf("%d ",i);

            }
        }

//            System.out.println(factor);
    }
}







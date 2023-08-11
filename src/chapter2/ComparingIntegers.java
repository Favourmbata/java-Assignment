package chapter2;

import java.util.Scanner;

public class ComparingIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer");
        int number1 = scanner.nextInt();
        System.out.println("enter the squared number");
       int  square = number1 * number1 ;
        System.out.printf("number1: %d\n", number1);
        System.out.printf("square: %d \n",square);

    }

}

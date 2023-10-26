package Coding;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int number;
       int index = 0;
      int [] binary = new int[100];


       System.out.print("Enter a decimal number:");
         number = scanner.nextInt();

       while (number != 0){
           binary[index] = number % 2;
           number = number /2;
           index++;
       }
        System.out.print("Binary value is : ");
        for (int j = index-1; j >= 0; j--) {
            System.out.print(" " +binary[j]);
        }
    }
}

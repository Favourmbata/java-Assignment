package Chibuzor;

import java.util.Scanner;

public class PositiveNegativeNdZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;

        char choice;

        do {
            System.out.println("Enter The numbers you want");
            int userInput = scanner.nextInt();

            if (userInput > 0){
                countPositive++;

            } else if (userInput < 0) {
               countNegative++;
            }

            else {
               countZeros++;
            }
            System.out.println("Do you want to continue y/n?");
            choice = scanner.next().charAt(0);

        }while (choice == 'y'||choice == 'n');
        System.out.println("Positive numbers: " +countPositive);
        System.out.println("Negative numbers: " +countNegative);
        System.out.println("Zero numbers: "+countZeros);


    }
}

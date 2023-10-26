package Coding;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.print("Enter a binary number: ");
        String binary = userInput.next();

        int baseValue = 2;
        int exponentValue = 0;
        int powerValue = 1;
        int decimal = 0;

        int i = binary.length() - 1;

        while (i >= 0) {
            if (binary.charAt(i) == '1') {
                for (int j = 0; j < exponentValue; j++) {
                    powerValue *= baseValue;
                }
                decimal += powerValue;
                powerValue = 1;
            }
            i--;
            exponentValue++;
        }
        System.out.println ("decimal number is : " + decimal);
    }

}


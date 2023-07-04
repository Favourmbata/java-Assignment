package practice;

import java.util.Scanner;

public class decimalEquivqlentOfBinaryNumber {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a binary number");
        String binaryNumber = scanner.nextLine();
        int decimalValue = 0;
        int powerOfTwo = 1;

        for (int i = binaryNumber.length()-1;i >= 0;i--){
            int digit = binaryNumber.charAt(i)- '0';
            decimalValue += digit * powerOfTwo;
            powerOfTwo *= 2;
        }
        System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimalValue);


    }










}

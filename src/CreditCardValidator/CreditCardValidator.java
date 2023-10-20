package CreditCardValidator;

import java.util.Scanner;

public class CreditCardValidator {
 static Scanner scanner = new Scanner(System.in);
    public static void creditCardValidator() {
        System.out.println("Hello, kindly enter credit card details to verify");
        String creditCard = scanner.nextLine();
        if (creditCard.length() >=13 && creditCard.length() <=16){
        int sumEvenAndOdd = 0;
        int evenTotal = 0, length = creditCard.length();
        int oddTotal = 0;
        String validType = "", cardType = "";
        for (int i = creditCard.length() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                int num = Integer.parseInt(String.valueOf(creditCard.charAt(i)));
                int favour = num * 2;
                if (favour > 9) {
                    int first = Integer.parseInt(String.valueOf(String.valueOf(favour).charAt(0)));
                    int second = Integer.parseInt(String.valueOf(String.valueOf(favour).charAt(1)));
                    favour = first + second;
                }
                evenTotal += favour;
            } else {
                int num = Integer.parseInt(String.valueOf(creditCard.charAt(i)));
                oddTotal += num;
            }
        }
        sumEvenAndOdd = evenTotal + oddTotal;
        if (sumEvenAndOdd % 10 == 0) {
            validType = "Valid Card";
        } else if (sumEvenAndOdd % 10 !=0){
            validType = "Invalid Card";
        }
        if (creditCard.charAt(0) == '4') {
            cardType = "Visa Card";

        } else if (creditCard.charAt(0) == '5') {
            cardType =  "Master Card";
        }
         else if (creditCard.charAt(0) == '3' && creditCard.charAt(0) == '7') {
            cardType = "Discover Cards";
        }else cardType = "Invalid Card";
            System.out.println("**********************************"+"\n"+
                    "**Card Type Is:" + cardType + "\n" +
                    "**Card Number Is:" + creditCard + "\n" +
                    "**Card Digit Length:" + length + "\n" +
                    "**Card Vadilidty Status : " + validType+"\n"+
                    "*************************************************");}
//         System.out.println("please put a valid card");

            }
    public static void main(String[] args) {
        creditCardValidator();
    }
 }

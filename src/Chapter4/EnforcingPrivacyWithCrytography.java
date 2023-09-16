package Chapter4;

import java.util.Random;
import java.util.Scanner;

public class EnforcingPrivacyWithCrytography {

//    public void  print ( int input) {
//        System.out.println(input);
//    }
//    public void encrypt(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter four Digits number");
//
//    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" enter four didits");
        int number = input.nextInt();

        int firstDigit = number/1000;
        int secondDigit = number/100;
        int thirdDigit = number/10;
        int fourthDigit = number/1;

        int digit1 = (firstDigit + 7)%10;
       int digit2 = (secondDigit + 7)%10;
       int digit3 = (thirdDigit + 7)%10;
       int digit4 = (fourthDigit + 7)%10;

      int encrypt = firstDigit;
       firstDigit = thirdDigit;
       secondDigit = fourthDigit;

       int encrypti = secondDigit;
       secondDigit = fourthDigit;
       fourthDigit = encrypti;



       int total = firstDigit + secondDigit + thirdDigit +fourthDigit;




        System.out.println("The encryted value is-> " + total);

    }



}

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
        int number = 1234;

        int firstDigit = number/1000;
        int secondDigit = number/100%10;
        int thirdDigit = (number/10)%100%10;
        int fourthDigit = number%10;

        int first = firstDigit + 7;
       int second = secondDigit + 7;
       int third = thirdDigit + 7;
       int fourth = fourthDigit + 7;

      firstDigit = thirdDigit;
      secondDigit = fourthDigit;

    }



}

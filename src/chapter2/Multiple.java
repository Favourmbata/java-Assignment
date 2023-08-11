package chapter2;

import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer");
        int firstNumber = input.nextInt();
        System.out.println("enter second integer");
        int secondNumber = input.nextInt();
        int firstNumberTripled = firstNumber * 3;
       int secondNumberDouble = secondNumber *2;
       if (firstNumberTripled == secondNumberDouble){
           System.out.println("This a number :" + firstNumberTripled);
       }else {
           System.out.println("this is second number " +secondNumberDouble);
       }
    }


}

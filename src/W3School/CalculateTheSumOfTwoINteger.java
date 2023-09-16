package W3School;

import java.util.Scanner;

public class CalculateTheSumOfTwoINteger {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter first integer");
        int number1 = console.nextInt();

        System.out.println("Enter second integer");
        int number2 = console.nextInt();

        System.out.println("Enter third integer");
        int number3 = console.nextInt();
         int add = number1 + number2;
         if (add == number3){
             System.out.println("True");
         }else {
             System.out.println("False");
         }
    }
}

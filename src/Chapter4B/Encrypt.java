package Chapter4B;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter four digit integer");
        int number1 = input.nextInt();

        System.out.println("Enter second integer");
       int number2 = input.nextInt();

        System.out.println("Enter third integer");
        int number3 = input.nextInt();

        System.out.println("Enter fourth integer");
        int number4 = input.nextInt();




          int digit1 = number1 + 7 ;
          int digit2  = number2  + 7;
          int digit3  = number3 + 7;
          int digit4 = number4 + 7;

           digit1 = number1 / 1000;
           digit2 = number2 / 100%10;
           digit3 = number3 / 10%10;
           digit4 = number4 % 10;

          int number = number1;
           number1 = number3;
           number2 = number4;


        System.out.println("The encrypted value is " + number1 + " " + number2 + " " + " " +number3 + " " + number4);
    }
}

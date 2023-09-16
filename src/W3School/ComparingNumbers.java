package W3School;

import java.util.Scanner;

public class ComparingNumbers {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = input.nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        System.out.println("Enter third number");
        int number3 = input.nextInt();


      if (number1 == number2 && number1 == number3){
          System.out.println(" All Numbers are Equal:");
      } else if (number1 == number2 || (number1 == number3)||(number3 == number2)) {
          System.out.println("Neither Numbers are different");
      }else {
          System.out.println("All numbers are different");
      }
    }
}

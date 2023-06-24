package Chapter4;

import java.util.Scanner;

public class PositiveAndNegativeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("positive number");
        } else if (number < 0) ;

        System.out.println("number is negative");

        {
      //  else
        }
            System.out.println("number is zero");


        }


    }




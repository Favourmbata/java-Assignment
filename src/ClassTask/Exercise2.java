package ClassTask;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        number =  number % 10;
         number = number + 10;
           System.out.println(number);
       }
    }


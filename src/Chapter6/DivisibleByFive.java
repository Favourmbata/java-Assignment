package Chapter6;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any integer");
        int number = scan.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            if (number % 5 == 0){
                System.out.println(number + " is Divisible by 5:");
            }else {
                System.out.println(number + "  is not divisible by 5:");
        }

        }


    }



  }







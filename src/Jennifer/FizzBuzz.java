package Jennifer;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
       int number = scanner.nextInt();

        System.out.println("The fizz,Buzz,andFizzBuzz numbers");
        for (int i = 1; i <= number ; i++) {
            if (i%3 == 0 && i %5 == 0){
                System.out.print("fizzBuzz");
            } else if (i %3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.print(i);
            }
            System.out.print(","+" ");
        }
    }
}

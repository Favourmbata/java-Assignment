package Chapter6;

import java.util.Scanner;

public class DivisibleByFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            boolean divisibleByFive = Divisible(number);
            if (divisibleByFive){
                System.out.println(number + " is disible by 5");
            } else {
                System.out.println(number + " is not divisible by 5");
            }

        }


    }

    private static boolean Divisible(int number) {
    return  number % 5 == 0;
    }

}

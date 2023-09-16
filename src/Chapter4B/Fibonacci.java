package Chapter4B;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int firstTerm = 0;
        int secondTerm = 1;
       int thirdTerm;

        System.out.println("Enter number of series: ");
        int number = keyboard.nextInt();

        System.out.println(firstTerm + " " +secondTerm);
        for (int i = 3; i < number ; i++) {
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

    }
}

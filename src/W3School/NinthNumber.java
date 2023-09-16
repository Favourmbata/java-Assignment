package W3School;

import java.util.Scanner;

public class NinthNumber {
    public static void main(String[] args) {

        int sum = 0;
      Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        System.out.println("The first natural numbers include:" + number);
        for (int i = 1; i <= number ; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum natual number: "+number+ " Terms:" + sum);
    }
}

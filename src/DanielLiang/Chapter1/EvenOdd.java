package DanielLiang.Chapter1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number %2 == 0){
            System.out.println("The number is divisible by 2");
        } else if (number %2 != 0) {
            System.out.println("The number is divisible by 3");
        }
    }


}

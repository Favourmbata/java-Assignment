package Chapter5;

import java.util.Scanner;

public class PrintSum {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int total = 0;
        int score = 0;
        for (int number = 1; number <= 10; number++) {
            System.out.println("enter score");
            total = scanner.nextInt();

        }
        System.out.println("enter sum score" +total++);
    }

    }



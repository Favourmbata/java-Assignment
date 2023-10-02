package ExamineYourSelf;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;


        System.out.println("Enter  10 score");
        int score = scan.nextInt();

        for (int i = 1; i <= 10 ; i++) {
        sum += score;
            System.out.println("The sum of scores is " + sum);

        }



        }
    }


package ExamineYourSelf;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter score");
//        int score = scan.nextInt();

        int []number = {10,20, 30, 40,50,60,70,80,90,10 };
        int sum = 0;

        for (int i = 1; i < number.length ; i++) {

          sum += number[i];

        }
        System.out.println("The sum of score is " + sum);

    }
}

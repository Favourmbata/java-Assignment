package Chapter5;

import java.util.Scanner;

public class ValidNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.println("enter 10 scores");
        int score = scanner.nextInt();

        for (int numberIndex = 0; numberIndex <=10 ; numberIndex++) {
            System.out.println("score" + score + " :" );
         total +=score;
        }

        System.out.print("total score:" + total);
    }

}

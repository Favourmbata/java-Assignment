package Jennifer;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a mumber between 1 to 100");
        int score = input.nextInt();
        if (score >= 90 || score == 100){
            System.out.println("A");
        }else if (score >= 80 || score == 89){
            System.out.println("B");
        }else if (score >= 70 || score == 79){
            System.out.println("C");
        }else if (score >= 60 || score == 69){
            System.out.println("D");
        }if (score < 60){
            System.out.println("F");
        }
    }
}

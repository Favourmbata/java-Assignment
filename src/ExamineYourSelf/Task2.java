package ExamineYourSelf;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

           int []scores = new int[10];
            int total = 0;
           double average = 0;
           int minimum = 1;
           int maximum = 0;
            for (int i = 0; i <   scores.length ; i++){
            System.out.println("Enter 10 scores  " +(i + 1));
              scores[i] = scan.nextInt();



            total = total +scores[i] ;
            average = (double) total / scores.length;

            if (scores[i] > maximum) {
                maximum = scores[i];
            }




            }


        System.out.println("The total is " +total );
        System.out.println("The average is " + average);
        System.out.println("The maximum is " + maximum);
        System.out.println("The minimum is " + minimum);

    }



}

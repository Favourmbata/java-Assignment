package DanielLiang.Chapter1;

import java.util.Scanner;

public class CountNumberOccurence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();


        int[] scores = new int[numberOfStudents];
        int bestScores = input.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("enter scores: " + (i + 1));
            scores[i] = input.nextInt();
            
            if (scores[i] > bestScores) {
                bestScores = scores[i];
            }

        }

        char[] grades = new char[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            if (scores[i] >= bestScores - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= bestScores - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= bestScores - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= bestScores - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("Grades");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("students " + (i + 1) + " score " + " is " + scores[i] + " and " + " grade " + " is " + grades[i]);
        }


    }
}
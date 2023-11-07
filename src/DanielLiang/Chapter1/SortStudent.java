package DanielLiang.Chapter1;

import java.util.Scanner;

public class SortStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students:");
        int numberOfStudents = input.nextInt();

        String[]studentsName = new String[numberOfStudents];
        int[]studentsScore = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents ; i++) {
            System.out.print("enter student names:" +(i +1));
            studentsName[i] = input.next();
            System.out.print("enter students score:" +(i +1));
            studentsScore[i] = input.nextInt();
        }
        for (int i = 0; i < numberOfStudents-1 ; i++) {
            for (int j = 0; j < numberOfStudents -1 -i ; j++) {
                if (studentsScore[i] < studentsScore[j]){

                    int tempScore = studentsScore[i];
                    studentsScore[i] = studentsScore[j +1];
                    studentsScore[j +1] = tempScore;

                String tempNames = studentsName[i];
                studentsName[i] = studentsName[j +1];
                studentsName[j +1] = tempNames;

                }
            }
        }
        System.out.println("Student names and scores in decreasing order:");
        for (int i = 0; i < numberOfStudents ; i++) {
            System.out.println(studentsName[i] +":" +studentsScore[i]);
        }
    }


}


package ArrayAssigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Working {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

            System.out.println("How many students do you have?");
            int numberOfStudents = scanner.nextInt();

            System.out.println("How many subjects do they offer?");
            int numberOfSujects = scanner.nextInt();

            System.out.println("saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("saved sucessfuly");
            int[][]students = new int[numberOfStudents][numberOfSujects];
            for (int student = 0; student < students.length; student++) {
                for (int subjects = 0; subjects < students[student].length; subjects++) {
                    while (true){
                        int allStudents = student  + 1;
                        int allSubjects = subjects + 1;
                        System.out.println("entering student score"+ allStudents +"\nenter subject" +allSubjects);
                        score = scanner.nextInt();
                        if (score <= 0 || score >=100)continue;

                        break;
                    }
                    System.out.println("saving>>>>>>>>>>>>>>>");
                    System.out.println("saved sucessfully");
                    students[student][subjects] = score;

                }
                }


    }
     public static List <List<Object>> tableCreation(int rows, int column, int value){
         List <List<Object>> table = new ArrayList<>();
        for (int i = 0; i < rows ; i++) {
             List<Object> row = new ArrayList<>();
            for (int j = 0; j < column; j++) {
                 row.add(value);
             }
          table.add(row);
        }
        return  table;
     }

  public static void fillTable(){
     int[][]studentScore;
     int numberOfStudents;
     int numberOfSubjects;
     int [] totalScore;
     String default_value = "DEFAULT_VALUE";


    }
}

package StudentGrade;

import java.util.Scanner;

public class StudentGrade {


    Scanner input = new Scanner(System.in);
      public void print(String word){
          System.out.println(word);
      }

     public   void  studentRecord(){

int grade = 0;


        print("How many Student do you have");
        String number = input.next();
        int numberOfStudent = Integer.parseInt(number);
        print("How many subject do they offer");
        String subject = input.next();
        int numberOfSubjects = Integer.parseInt(subject);


    int [][] students = new int  [numberOfStudent][numberOfSubjects];
         int [] studentTotalScore = new int [students.length];
         int [] studentsAverageScore = new  int[students.length];
         for (int student = 0; student < students.length ; student++) {
             for (int subjects = 0; subjects  < students[student].length ; subjects++) {
                    while (true) {
                        int nextStudent = student+1;
                        int nextSubjectt = subjects+1;
                        print("entering  score for student => " + nextStudent +
                                " \n enter  subject score => " + nextSubjectt);

                        grade = input.nextInt();


                        if (grade < 0 || grade > 100) continue;
                        break;
                    }
                     print("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                     print("saved sucessful");
                students[student][subjects] = grade;

                 }
         }

            int sum = 0;
         int score = 0;
         for (int i = 0; i < students.length; i++) {
             for (score = 0; score < students[i].length; score++) {
                sum += students[i][score];

             }
             studentTotalScore[i] = sum;
             if (score == students[i].length ){
                 sum = 0;
             }

         }

         int average = 0;
         int k = 0;
         for (int j = 0; j < students.length ; j++) {
             for ( k = 0; k <students[j].length ; k++) {
                sum += students[j][k];
                 average = students.length/sum;

             }
             studentsAverageScore[j] = average;
             if (k == students[j].length ){
                 sum = 0;
                 average = 0;
             }

         }

             }

    public static void main(String[] args) {


          StudentGrade goat = new StudentGrade();

          goat.studentRecord();

    }


     }









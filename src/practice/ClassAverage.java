package practice;

import java.util.Scanner;
import java.util.concurrent.Callable;


public class ClassAverage {
   private  Scanner scanner = new Scanner(System.in);

       public void gradeCalculator(){
           int total = 0;
           int gradeCouter = 1;

           while (gradeCouter <= 10){
               System.out.println("enter grade");
               int grade = scanner.nextInt();
               total = total + grade;
               gradeCouter = gradeCouter+1;

           }
            int average = total/10;
           System.out.printf("%n total of all grade %d%n",total);
           System.out.printf("class average is %d%n",average);
       }


    public static void main(String[] args) {
      ClassAverage classAverage = new ClassAverage();
classAverage.gradeCalculator();



    }

        }
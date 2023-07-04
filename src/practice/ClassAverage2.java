package practice;

import java.util.Scanner;

public class ClassAverage2 {

private Scanner scanner = new Scanner(System.in);

    public void gradeCalculate(){
       int total = 0;
       int gradeCounter = 0;
        System.out.println("enter grade or -1 to quit");
        int grade = scanner.nextInt();

        while (grade!= -1){
            total = total + grade;
            System.out.println("enter grade or -1 to quit");
            grade = scanner.nextInt();

        }
        if(gradeCounter != 0){
            double average = (double) total /gradeCounter;
            System.out.printf("%n total of grade %d grades entered is %d%n",gradeCounter,total);
            System.out.printf("class average is %.2f%n",average);
        }
        else {
            System.out.println("no grade were entered");
        }

    }

    public static void main(String[] args) {
            ClassAverage2 classAverage2 = new ClassAverage2();
            classAverage2.gradeCalculate();
            }
        };









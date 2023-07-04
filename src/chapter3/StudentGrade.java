package chapter3;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {


   Scanner scanner = new Scanner(System.in);
     while (true) {
         System.out.println("enter student  Grade or enter -1 to exit");
         int studentGrade = scanner.nextInt();

         switch (studentGrade) {
             case 90:
                 System.out.println("A");
                 break;
             case 80:
                 System.out.println("B");
                 break;
             case 70:
                 System.out.println("C");
                 break;
             case 60:
                 System.out.println("D");
                 break;
             default:
                 System.out.println("f");
         }

         if (studentGrade == -1 )break;

     }





















    }











}

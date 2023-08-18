package MyOwn;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName;
        char letterGrade;

        int student1 = 0,student2 = 0,student3 = 0,student4 = 0;
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter student name->");
            studentName = scanner.nextLine();

            System.out.println("enter student letter grade");
           letterGrade = scanner.next().charAt(0);

           switch (letterGrade){
               case 'A':
                  student1++;
                   break;
               case 'B':
                   student2++;
                   break;
               case 'C':
                   student3++;
                   break;
               case 'D':
                   student4++;
                   break;
           }

        }

        System.out.println("Number of student with Grade A=>"+student1);
        System.out.println("Number of student with Grade B=>"+student2);
        System.out.println("Number of student with Grade C=>"+student3);
        System.out.println("Number of student with Grade D=>"+student4);


        }
        }







package Chapter5;

import java.util.Scanner;

public class StudentGrade {

public static String studentGradeCalculator(String grade){
      int  A = 0;
      int B = 0;
      int C = 0;
      int D = 0;
    switch (grade){
        case "A":
            A++;
      break;
        case "B":
            B++;
        break;
        case "C":
            C++;
            break;
        case "D":
            D++;
            break;
        default:
    }




   return String.format("""
           Number of student that got grade A -> %d
           Number of student that got grade B -> %d
           Number of student that got grade C -> %d
           Number of student that got grade D -> %d
           """,A,B,C,D);
}

    public static void main(String[] args) {
        String studentGrade=" ";
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 5; i++) {
            System.out.println("please enter grade for student "+i);
       studentGrade = studentGradeCalculator(scanner.next());
        }

        System.out.println(studentGrade);

    }




}

package Chapter4;

import java.util.Scanner;

public class StudentNestedIfTest {

    public static void main(String[] args) {


  Scanner scanner = new Scanner(System.in);
  Scanner scanner1 = new Scanner(System.in);
        StudentNestedIf account1 = new StudentNestedIf("jane Green",93.5);
        StudentNestedIf account2 = new StudentNestedIf("grace belle",72.75);

        System.out.printf("%s's letter grade is: %s%n",account1.getName(),account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",account2.getName(),account2.getLetterGrade());

    }

    }





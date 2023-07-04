package Chapter4;

import java.util.Scanner;

public class StudentNestedIfTest {

    public static void main(String[] args) {


  Scanner scanner = new Scanner(System.in);
  Scanner scanner1 = new Scanner(System.in);
        StudentNestedIf account1 = new StudentNestedIf();
        StudentNestedIf account2 = new StudentNestedIf();
    while (true) {

        System.out.println("account1 enter your name");
        String name = scanner1.next();
        account1.setName(name);
        System.out.println("account1 enter your grade");
        double average = scanner.nextDouble();
        account1.setAverage(average);
        System.out.println("account2 enter your name");
        String name2 = scanner1.next();
        System.out.println("account2 enter your grade");
        double average2 = scanner.nextDouble();
        System.out.println("accout1 this is your name  "+account1.getName());
        System.out.println("account1 this is your grade "+account1.getLetterGrade());
        System.out.println("account2 this is your name "+account2.getName());
        System.out.println("account2 this is your grade "+account2.getLetterGrade());
        System.out.println("press 1 to continue or -1 to exist");
       int response = scanner.nextInt();
       if(response == 1 )continue;
       if (response != 1)break;

    }

    }



}

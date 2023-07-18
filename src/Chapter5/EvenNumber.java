package Chapter5;

import java.util.Scanner;

public class EvenNumber {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

 int total = 0;
        System.out.println("enter 10 numbers");
        for (int number = 1; number <=10 ; number+=2) {
            System.out.println("total" + number+ " ");
        }
        total = scanner.nextInt();


    }


}
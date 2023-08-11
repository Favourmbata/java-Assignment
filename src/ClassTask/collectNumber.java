package ClassTask;

import java.util.Scanner;

public class collectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
         int number = input.nextInt();
         if (number == 0 ){
             System.out.println(" " +1);
         }else {
             System.out.println(" " +0);
         }
    }
}

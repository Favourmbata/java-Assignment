package Jennifer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertDigitToWords {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        int userInput = 0;

        try {
           userInput = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Wrong input");
            main();
            //System.out.println("Enter a number");
        }

         if (userInput == 1) {
             System.out.println("One");
             return;
         }
         else if (userInput == 2) {
             System.out.println("Two");
             return;
         }
         else if (userInput == 3) {
             System.out.println("Three");
             return;
         }
         else if (userInput == 4) {
             System.out.println("Four");
             return;
         }
         else if (userInput == 5) {
             System.out.println("Five");
             return;
         }
        else if (userInput == 6) {
             System.out.println("Six");
             return;
         }
         else if (userInput == 7) {
             System.out.println("Seven");
             return;
         }
        else if (userInput == 8) {
             System.out.println("Eight");
             return;
         }
        else if (userInput == 9) {
             System.out.println("Nine");
             return;
         }
         else if (userInput == 10) {
             System.out.println("Ten");
         return;
         }
         else main();
    }
}

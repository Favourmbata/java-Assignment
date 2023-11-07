package Class;

import java.util.Arrays;
import java.util.Scanner;


public class TwoByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //        int [] t = {10,11,12,13,14,15,16,17,18,19,20};
//        for (int i = 0; i < t.length ; i++) {
//
//            System.out.println("The best score is: " + t[i] *2);
//
//        }

        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = -1;

        }

        // Input 10 numbers between 10 and 100
        for (int i = 0; i < myArray.length; i++) {
            int number;
            do {
                System.out.print("Enter a number between 10 and 100: ");
                number = input.nextInt();
            } while (number < 10 || number > 100);

            // Check for duplicates
            if (!contains(myArray, number)) {
                myArray[i] = number;
            }
        }

        // Display the contents of the array without -1 values
        System.out.print("Unique numbers: ");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != -1) {
                System.out.print(myArray[i] + " ");
            }
        }
    }

    // Check if the number is already in the array
    public static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}

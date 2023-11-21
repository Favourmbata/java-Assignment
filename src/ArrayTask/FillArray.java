package ArrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class FillArray {
//    write a program that fills an array with n integers
//            entered by the user.
    static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
        System.out.println("how many element?(max is 20):");
        int number = input.nextInt();
        while (number > 20 || number <=0){
            System.out.println("invalid number,try again");
        }
       int[]numbers = new int[number];
        fillArrayIntegers(numbers);
           printArrayOfIntegers(numbers);
    }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.println("elements");
        System.out.println(Arrays.toString(numbers));

    }

    private static void fillArrayIntegers(int[] numbers) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length ; i++) {
         numbers[i] = input.nextInt();
        }
    }




    }



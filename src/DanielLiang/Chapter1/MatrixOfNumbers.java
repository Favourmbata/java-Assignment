package DanielLiang.Chapter1;

import java.util.Random;
import java.util.Scanner;

public class MatrixOfNumbers {

   public static void printMatrix(int n){
       for (int i = 0; i < n ; i++) {
           for (int j = 0; j < n ; j++) {
               Random random = new Random();
               int value = random.nextInt(0, 2);

               System.out.print(value +" ");
           }
           System.out.println();
       }


   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n: ");
        int number = input.nextInt();


    printMatrix(number);
   }

    }


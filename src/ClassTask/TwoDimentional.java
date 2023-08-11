package ClassTask;

import java.util.Scanner;

public class TwoDimentional {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double sum = 0;
         double min = 0;
         double max = 0;

         double [][] myArray = new double[3][7];

        for (int row = 0; row < 3 ; row++) {
             for (int columns = 0; columns < 7 ; columns++) {
               if(columns == 0) {
                   System.out.println("enter three numbers");
                   myArray [row][0] = input.nextDouble();
               }  if (columns == 1){
                     System.out.println("enter three numbers");
                    myArray[row][1] = input.nextDouble();
                 }if (columns == 2){
                     myArray[row][2] = input.nextDouble();
                     System.out.println("enter three numbers");
                 }if(columns == 3 ){
                   myArray[row][3] = myArray[row][0] +myArray[row][1]+myArray[row][2]+myArray[row][3];

                   
                 }

            }
        }

    }


}

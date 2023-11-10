package TwoDimentionalArray;

import java.util.Scanner;

public class ThreeByFourMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 3;
        int columns = 4;
        double[][] matrix = new double[rows][columns];

        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int rowIndex = 0; rowIndex < matrix .length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
                matrix[rowIndex][columnIndex] = input.nextDouble();
            }
        }
          for (int columnIndex = 0; columnIndex < columns; columnIndex++){
            int columnSum = 0;
           for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            columnSum +=matrix[rowIndex][columnIndex];

            }
              System.out.println("Sum of the elements at column " + columnIndex + " is "+   columnSum);
        }



    }
}


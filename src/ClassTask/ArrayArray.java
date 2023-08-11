package ClassTask;

import java.util.Scanner;

public class ArrayArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        int[][] array = new int[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols - 1; col++) {
                System.out.printf("Enter the value for row %d, column %d: ", row + 1, col + 1);
                array[row][col] = scanner.nextInt();
            }
        }


        for (int row = 0; row < numRows; row++) {
            int sum = 0;
            for (int col = 0; col < numCols - 1; col++) {
                sum += array[row][col];
            }
            array[row][numCols - 1] = sum;
        }


        System.out.println("\n2D Array with Sum in the Fourth Column:");
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                System.out.printf("%5d ", array[row][col]);
            }
            System.out.println();
        }






        }



}

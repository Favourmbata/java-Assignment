package TwoDimentionalArray;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][]summedElement = {{1,2,3,4},
                                 {4,5,6,7},
                                 {7,4,2,1}};

            for (int column = 0; column < summedElement[0].length ; column++) {
                int total = 0;
                for (int row = 0; row < summedElement.length ; row++){
                    total += summedElement[row][column];
                System.out.print(" sum for column " +  column + " is " +  total);
            }
            System.out.println();
        }

    }
}

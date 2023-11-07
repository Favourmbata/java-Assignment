package DanielLiang.Chapter1;

import java.util.Scanner;

public class BubbleSort {
    public static void sortBubble(double[] arr) {
        int n = arr.length;

        boolean swapped;

        for (int row = 0; row < n - 1; row++) {
            swapped = false;
            for (int column = 0; column < n - row - 1; column++) {
                if (arr[column] > arr[column + 1]) {
                 double   temp = arr[column];
                    arr[column] = arr[column + 1];
                    arr[column + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] sortAlgorithm = new double[10];
        System.out.println("Enter ten numbers:");
        for (int row = 0; row < 10; row++) {
            sortAlgorithm[row] = input.nextDouble();
        }

            sortBubble(sortAlgorithm);
            for (double value : sortAlgorithm) {
                System.out.print(value + "");
        }
        System.out.println();
    }
}


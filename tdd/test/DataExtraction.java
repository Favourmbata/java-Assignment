package test;

import java.util.Arrays;
import java.util.Scanner;

public class DataExtraction {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the row you want->");
        int row = scanner.nextInt();

        System.out.println("Enter the column you want->");
        int column = scanner.nextInt();
        int[][]dataSet = new int[row][column];
        for (int i = 0; i < dataSet.length ; i++) {
            for (int j = 0; j < dataSet[i].length; j++) {
                System.out.println("Enter the data you want");
                int data = scanner.nextInt();
                dataSet[i][j] = data;
            }
        }
                System.out.println(Arrays.deepToString(dataSet));

                System.out.println("Enter start position");
                int startPosition = scanner.nextInt();

                System.out.println("Enter end position");
                int endPosition = scanner.nextInt();

                int[]extractData = extract(dataSet,row,startPosition,endPosition);
                System.out.println(Arrays.toString(dataSet));
    }

    public static int[] extract(int[][] dataSet, int row,int startPosition, int endPosition) {
       int [] dataRow = dataSet[row -1];
       int[]extractData = new int[(endPosition-startPosition)+1];
       int count = 0;

       for (int i = startPosition -1; i < endPosition ; i++) {
            extractData[count] = dataRow[i];
           count++;
        }

        return extractData;
    }

    public int[] extractByColumn(int[][] dataSet, int column, int startPosition, int endPosition) {
//      int [] dataColumn = dataSet[column -1];
        int value = column -1;
      int []extractData = new  int[(endPosition - startPosition) + 1];
      int count = 0;
      for (int index = startPosition - 1; index < endPosition ; index++) {
            extractData[count] = dataSet[index][value];
            count++;
      }

        return  extractData;
    }
}

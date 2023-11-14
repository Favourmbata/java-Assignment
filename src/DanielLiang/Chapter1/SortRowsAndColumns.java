package DanielLiang.Chapter1;

import java.util.Arrays;

public class SortRowsAndColumns {

  public static void sort(int number [][]){
      int[] min = new int[2];
      for (int row = 0; row < number.length - 1; row++) {
          min[0] = number[row][0];
          min[1] = number[row][1];
          int index = row;
          for (int i = row + 1; i < number.length; i++) {
              if (number[i][0] <= min[0] && (number[i][0] < min[1] ||
                      number[i][1] < min[0] || number[i][1] < min[1])) {
                  min[0] = number[i][0];
                  min[1] = number[i][1];
                  index = i;
              }
          }
          if (index != row){
              number[index][0] = number[row][0];
              number[index][1] = number[row][1];
              number[row][0] = min[0];
              number[row][1] = min[1];
          }
      }
  }


    public static void main(String[] args) {
        int[][] num = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

        sort(num);
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length ; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }

}
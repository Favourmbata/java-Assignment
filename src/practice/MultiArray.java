package practice;

public class MultiArray {

    public static void main(String[] args) {

        int[][] doubleArray = new int[3][8];

        doubleArray[2][4] = 9;


        int[][] array2D = {{45, 6, 4}, {67, 34, 2, 50}, {89, 8, 23}, {7, 90, 5, 78, 56}};

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
//                System.out.print(i+"  <== \n");
                if (i == 3 && j == 0)
                    array2D[i][j] +=3;

                System.out.print(array2D[i][j] + " ");

            }

            System.out.println();
        }
    }






}

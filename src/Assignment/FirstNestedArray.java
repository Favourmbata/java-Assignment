package Assignment;

public class FirstNestedArray {

    public static void main(String[] args) {


       int [][] array = {{0, 0, 0, 1, 0, 0, 0},
                         {0, 0, 1, 1, 1, 0, 0},
                         {0, 1, 1, 1, 1, 1, 0},
                         {0, 1, 1, 1, 1, 1, 0},
                         {0, 0, 0, 1, 0, 0, 0},
                         {0, 0, 0, 1, 0, 0, 0},
                         {0, 0, 0, 1, 0, 0, 0},
                         {0, 0, 0, 1, 0, 0, 0}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            if (array[i][j] == 0) System.out.print(" ");
            if (array[i][j] == 1) System.out.print(" * ");
            }
            System.out.println();
        }




    }





}

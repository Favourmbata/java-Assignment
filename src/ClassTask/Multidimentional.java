package ClassTask;

public class Multidimentional {

    public static void main(String[] args) {

     int[][] myArr = {
             {5,6,7},
             {2,5,8},
             {2,4,7}
     };
        for (int row = 0; row < myArr.length ; row++) {
            for (int column = 0; column < myArr[row].length ; column++) {
                System.out.print(myArr[row][column] + " ");
            }
            System.out.println();
        }
   
   
    }

}

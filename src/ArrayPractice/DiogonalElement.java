package ArrayPractice;

public class DiogonalElement {

    public static void main(String[] args) {


        int[][] myArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int row = 0; row < myArr.length; row++) {
            for (int column = 0; column <myArr[row].length ; column++) {
             if (row == column ||row+column == myArr.length-1) {
                 System.out.print(myArr[row][column]+" ");
             }else {
                 System.out.print("  ");
             }

            }
            System.out.println();
        }
    }
}
package ArrayPractice;

public class TWoDimentional   {
    public static void main(String[] args) {
        
        int [][]myArr = {{1,2},{3,4},{5,6}};
        for (int row = 0; row < myArr.length; row++) {
            for (int column = 0; column < myArr[row].length ; column++) {
                System.out.print(myArr[row][column] + "  ");
            }
            System.out.println();
        }
    }
}

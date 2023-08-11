package ClassTask;

public class MyTwoDArray {

    public static void main(String[] args) {

   int [][]arr = {
           {1,2,3},
           {4,5,6},
           {7,8,9},

   };
        for (int row = 0; row <arr.length ; row++){
       int sum = 0;
       for (int column = 0; column <arr[0].length ; column++) {
                sum += arr[row][column];
            }
       System.out.println("sum = " +sum);
   }

    }


}

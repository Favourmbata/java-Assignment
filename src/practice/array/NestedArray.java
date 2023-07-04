package practice.array;

public class NestedArray {
    public static void main(String[] args) {

        int[][] twoArray = {{6, 8, 90, 4},{2, 1, 12 ,60},{3,5,20,80,100},{0,10,30,50,11}};

        for (int i = 0; i < twoArray.length ; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {

                System.out.print(twoArray[i][j]+" ");

            }
            System.out.println();
        }



    }


}

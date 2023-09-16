package Swapping;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swapping {
    public int reArranging(int swapper) {
        int[] myArr = {1, 2, 3, 4, 5, 6};
        for (int index = 0; index < myArr.length / 2; index++) {
            int temp = myArr[index];
            myArr[index] = myArr[myArr.length - index - 1];
            myArr[myArr.length - index - 1] = temp;

        }
        System.out.println(Arrays.toString(myArr));
        return swapper;
    }

    public static void main(String[] args) {
        Swapping swapping = new Swapping();
        swapping.reArranging(6);
    }

}







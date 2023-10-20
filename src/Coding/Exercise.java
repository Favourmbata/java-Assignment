package Coding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[][] items = {{34, 23, 65},
                         {23, 67, 44, 68}};
//        for (int[] iterate : items) {
//            System.out.println();
//
//            for (int item : iterate) {
//                System.out.print(item +"        ");
//
//            }
//        }
//        System.out.println();
//    }


        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] +"        ");
            }
            System.out.println();
        }

    }
}

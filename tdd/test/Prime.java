package test;

import java.util.Arrays;

public class Prime {

    public static int[] getPrimeProducts(int products) {
        int count = 0;

        for (int i = 2; i < products; i++) {
            while (products % 2 == 0) {
                count++;
                products /= 2;
            }

        }
             int []array  = new int[count];
            
            for (int j = 0; j < array.length; j++) {
                for (int i = 0; i <products ; i++) {

                    if (products > 2) {
                        array [j] = products;
                        array[i] = 2;
                        i++;
                    }
                    }
                }
             return array;
            }
    }

//    public static void main(String[] args) {
//        int[] myMarray = {4, 8};
//        System.out.println(Arrays.toString(getPrimeProducts(myMarray)));
//    }
//}

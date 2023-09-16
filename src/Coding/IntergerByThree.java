package Coding;

import java.util.Scanner;

public class IntergerByThree {
    public static void main(String[] args) {


        int sum = 0;
        for (int i = 1; i < 30    ; i++) {
            if (i %3 == 1){
               sum = sum + i;

                System.out.println(sum);
            }
        }

    }
}

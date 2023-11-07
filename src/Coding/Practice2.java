package Coding;


import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int[]myArr = new int[10];

        for (int i = 0; i < 100 ; i++) {
            Random random = new Random();
            int counts = random.nextInt(10);
            myArr[counts]++;

        }

        for (int i = 0; i < myArr.length ; i++) {
            System.out.println("The counts of : " + i + "s:" + myArr[i]);
        }
    }
    }




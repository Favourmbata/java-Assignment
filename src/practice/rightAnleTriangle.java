package practice;

import java.util.Scanner;

public class rightAnleTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the base lenghth of triangle");
        int baseLenghth  = scanner.nextInt();
        for (int i = 1; i <= baseLenghth; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }



}

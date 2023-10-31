package Chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {


    public static int greatCommonDivisor(int a, int b) {

        int temp = Math.min(a, b);
        while (temp > 0) {
            if (a % temp == 0 && b % temp == 0) {
                break;
            }
            temp--;
        }
        return temp;
    }

    public static void main(String[] args) {
        int a = 252, b = 105;
        System.out.println("The greatest common factor of " + a + " and " + b + " is " + " = " + greatCommonDivisor(a, b));
    }
}
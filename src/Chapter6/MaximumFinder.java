package Chapter6;

import java.util.Scanner;

public class MaximumFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three floating numbers");

        double number1 = input.nextInt();
        double number2 = input.nextInt();
        double number3 = input.nextInt();
        double result = maximum(number1, number2, number3);

    }
        public static double maximum ( double x, double y, double z){
            double maximumValue = x;
            if (y > maximumValue) {
                maximumValue = y;


            }
            if (z > maximumValue) {
                maximumValue = z;
            }
            return maximumValue;

        }
    }

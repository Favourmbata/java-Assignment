package Chapter4B;

import java.util.Scanner;

public class RightAngleTriangle {
    public int printingRightAngle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of base triangle");
        int base = scanner.nextInt();

        for (int i = 1; i < base ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


return base;
    }

    public static void main(String[] args) {
        RightAngleTriangle rightAngleTriangle = new RightAngleTriangle();
        rightAngleTriangle.printingRightAngle();
    }

}

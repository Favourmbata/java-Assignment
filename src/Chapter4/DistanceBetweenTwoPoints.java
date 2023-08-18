package Chapter4;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter x-cordinate for  point 1 :");
        int x1 = scanner.nextInt();

        System.out.println("enter y-cordinate for point 1");
        int y1 = scanner.nextInt();

        System.out.println("enter y-cordinate for point 2");
        int x2 = scanner.nextInt();

        System.out.println("enter y-cordinate for point 2");
        int y2 = scanner.nextInt();


        boolean perpendicularPoints =  (x1 == x2 )||( x2 == x1);
        System.out.println("x and y are in perpendicular points -> 2"+ perpendicularPoints);
    }
}

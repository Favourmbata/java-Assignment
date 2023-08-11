package chapter2;

import java.util.Scanner;

import static java.lang.Math.PI;

public class RadiusOfCircle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius value");
        double radiusOfCircle = scanner.nextDouble();

         double Diameter = 2.0 * radiusOfCircle;
         double circumference = 2.0 * 3.14159 * radiusOfCircle;
         double area = 3.14159 * radiusOfCircle * radiusOfCircle ;

        System.out.printf("Diameter: %2f%n", +radiusOfCircle);
        System.out.printf("circumference: %2f%n",radiusOfCircle);
        System.out.printf("area: %2f%n",radiusOfCircle);
    }


}

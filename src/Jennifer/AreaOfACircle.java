package Jennifer;

import java.util.Scanner;

public class AreaOfACircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of a circle -> ");
        double radius = scanner.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2 * 3.14159 * radius;
        double area = 3.14159 * radius * radius;

        System.out.printf("The diameter --> %.2f%n", diameter);
        System.out.printf("The circumference --> %.2f%n", circumference);
        System.out.printf("The area --> %.32f%n", area);

    }
}

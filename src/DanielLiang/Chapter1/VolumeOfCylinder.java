package DanielLiang.Chapter1;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius and and length of cylinder");
       double radius= scanner.nextDouble();
       double length = scanner.nextDouble();

       double area = radius * radius * 3.14159;
       double volume = area  * length;

        System.out.printf("The area is: %.4f%n  -> " ,area);
        System.out.printf("The volume is: %.1f%n-> " , volume);
    }
}

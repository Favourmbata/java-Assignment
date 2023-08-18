package DanielLiang.Chapter1;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting velocity->");
        double startingVelocity = scanner.nextDouble();

        System.out.println("Enter the ending velocity->");
        double endingVelocity = scanner.nextDouble();

        System.out.println("Enter time span ->");
        double timeSpan = scanner.nextDouble();

        double averageAcceleration = (endingVelocity - startingVelocity) / timeSpan;
        System.out.printf("The average acceleration is: %.4f%n -> " , averageAcceleration);
    }
}

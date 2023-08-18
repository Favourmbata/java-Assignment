package DanielLiang.Chapter1;

import java.util.Scanner;

public class PoundsInKilogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number in pounds");
        double pounds = scanner.nextDouble();
        double kilograms =  pounds * 0.454;

        System.out.println("The pounds in kilogram is -> " + kilograms);
    }
}

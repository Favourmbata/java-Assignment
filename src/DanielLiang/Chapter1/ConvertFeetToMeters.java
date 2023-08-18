package DanielLiang.Chapter1;

import java.util.Scanner;

public class ConvertFeetToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter value for feet");
        double feet = scanner.nextDouble();
      double  meters = feet * 0.305;
        System.out.println("the value for feet is -> " +meters);

    }
}

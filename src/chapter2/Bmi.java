package chapter2;

import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter body weight in kilogram");
        double weight = scanner.nextDouble();
        System.out.println("enter your height in meters");
        double height = scanner.nextDouble();
        double bmi = weight/height * height;
        System.out.println("The body mass index is " + bmi + "kg/m2");
    }

}

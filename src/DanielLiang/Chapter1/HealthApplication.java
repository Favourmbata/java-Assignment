package DanielLiang.Chapter1;

import java.util.Scanner;

public class HealthApplication {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        double weight = console.nextDouble();

        System.out.println("Enter  for feet");
        int feet = console.nextInt();

        System.out.println("Enter iches:");
        int inches = console.nextInt();

        double bmi = weight / feet * inches;
        System.out.println("The body index is " + bmi);

       if (bmi < 18.5){
           System.out.println("underweight");
       }else if (bmi < 25){
           System.out.println("Normal");
       }else if (bmi < 30){
           System.out.println("Over weight");
       }else {
           System.out.println("Obese");
       }

    }
}

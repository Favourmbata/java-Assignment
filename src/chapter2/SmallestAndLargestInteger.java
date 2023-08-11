package chapter2;

import java.util.Scanner;

public class SmallestAndLargestInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer");
        int number1 = scanner.nextInt();
        System.out.println("enter second integer");
         double number2 = scanner.nextDouble();
        System.out.println("enter third integer");
         int number3 = scanner.nextInt();
        int sum = number1+number1+number1;
        double average = sum /3;
        double product = number1 * number2*number3;
        double LargestNumber = Math.max(number1,Math.max(number2,number3));
        double smallestNumber = Math.min (number1,Math.min(number2,number3));
        System.out.println("the sum is: " +sum);
        System.out.println("the average is: " +average);
        System.out.println("product is:" + product);
        System.out.println("the smallest number : " +smallestNumber);
        System.out.println("largest number  is: "+LargestNumber);
    }
}

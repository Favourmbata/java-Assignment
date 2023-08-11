package chapter2;

import java.util.Scanner;

public class PrintLargestAndSmallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer");
        int number1 = input.nextInt();
        System.out.println("enter second integer");
        int number2 = input.nextInt();
        System.out.println("enter third integer");
        int number3 = input.nextInt();
        System.out.println("enter fourth integer");
         int number4 = input.nextInt();
        System.out.println("enter fifth integer");
        int number5 = input.nextInt();
         int smallestNumber = input.nextInt();
         int largestNumber = input.nextInt();
         if (number1 > number2 || number1 < number2){
            System.out.println(smallestNumber);

        }else {
            System.out.println(largestNumber);

        } if (number2 > number3 || number2 < number3){
            System.out.println(smallestNumber);

        }else {
            System.out.println(largestNumber);
        }if (number3 > number4 || number3 <  number4){
            System.out.println(smallestNumber);

        }else {
            System.out.println(largestNumber);

        }if (number4 > number5 || number4 < number5){
            System.out.println(smallestNumber);
        }else {
            System.out.println(largestNumber);
        }
        System.out.println("smallest number:" +smallestNumber);
        System.out.println("largest number :" + largestNumber);
    }
}

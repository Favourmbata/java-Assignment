package Coding;

import java.util.Scanner;

public class EtremesNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int extremesOfSum = 0;
        int number;
        System.out.println("Enter a number");
        int max = scanner.nextInt();
        int min = scanner.nextInt();
        while (scanner.hasNextInt()){
           number = scanner.nextInt();
           if (number > max){
               max = number;
           }if (number < min){
               min = number;
            }count++;
            extremesOfSum = extremesOfSum + number;

            System.out.println("The maximum value is " +max);
            System.out.println("The minimum value is"+min);
            System.out.println("The extremes sum is "+extremesOfSum);
        }
    }



}

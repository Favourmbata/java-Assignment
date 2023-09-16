package Chapter4B;

import java.util.Scanner;

public class FindTwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int count = 0;
        int largest = 0;
        int secondLargest = 0;
        while (count <  10){
           System.out.println("Enter a number");
           int number = input.nextInt();

        if (number > largest){
            secondLargest = largest;
            largest = number;
        } else {
            secondLargest = number;
        }
            System.out.println("The largest is " + largest);
            System.out.println("The second largest is " +secondLargest);

        }

    }
}

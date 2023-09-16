package Chapter4B;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      int count = 0;
      int largest = 0;
       while (count <  10){
           System.out.println("Enter a number");
           int number = input.nextInt();
           if (number >=largest ){
               largest = number;
           }count++;

           System.out.println("The largest number is:"+largest);
       }
    }
}

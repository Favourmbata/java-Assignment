package Chapter4;

import java.util.Scanner;

public class LargestAndSmallestNUmber {


public void largestAndSmallestNumber(){

    Scanner scanner = new Scanner(System.in);
     int number = 0;
     int largestNumber = 0;
     int smallestNumber = 0;

     while (number != -1){
         System.out.println("Enter a number or -1 to end");
       number = scanner.nextInt();
       if(number == -1){
           break;
       }
 if (number > largestNumber){
     largestNumber = number;
 }
   else {
       if (number < largestNumber){
           smallestNumber = smallestNumber;
       }
 }




     }

}


}

package Chibuzor;

import java.util.Scanner;

public class LargesNdSmallestFromUser {

    public static void collectingNumbersFromUser() {

        Scanner input = new Scanner(System.in);
        int largest = 0;
        int smallest = 0;
        while (true){



          System.out.println("Enter a number (or -1 to break)");
          int number = input.nextInt();
            if (number == -1)
                break;
          if (number > largest)
              largest = number;
          else
              smallest = number;


            System.out.println("The largest is ->"+ largest);
            System.out.println("The smallest is -> "+smallest);
        }


    }

    public static void main(String[] args) {
       collectingNumbersFromUser();
    }

}
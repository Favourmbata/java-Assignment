package Assignment;

import java.util.Scanner;

public class Revision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  int sum = 0;
 int numer = 0;
 int evenNumber = 0;
 int oddNumber = 0;
 while (numer !=0 -1 ){
     System.out.println("Enter a number ");
     numer = scanner.nextInt();

     if(numer % 2 == 0){
        evenNumber= evenNumber +numer;

    }
    else {
        oddNumber= oddNumber + numer;
    }
 }
        System.out.println("Sum of evenNumber is " + evenNumber);
        System.out.println("sum of oddNumber " + oddNumber);

    }

}

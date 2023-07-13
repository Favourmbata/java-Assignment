package Chapter5.Practice;

import java.util.Scanner;

public class CalculateInterest {


public static double  calculateInterest(){
     Scanner input = new Scanner(System.in);
    System.out.println(" enter balance");
    double balance = input.nextDouble();
    System.out.println("enter annual Interest RAte");
    double annualInterestRate = input.nextDouble();
    double interest = balance * annualInterestRate/1200;
    return interest;


}

    public static void main(String[] args) {
        System.out.printf("The interest is  " + calculateInterest());
    }
}

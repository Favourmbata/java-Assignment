package Chapter5.Practice;

import java.util.Scanner;

public class FutureInvestmentValue {
    static Scanner input = new Scanner(System.in);

    public static void print(String word) {
        System.out.println(word);
    }

    public static void print(int word) {
        System.out.println(word);
    }

    public static void futureInvestmentValue() {

        print("Enter Investment Amount");
        double investmentAmount = input.nextDouble();
        print("Enter Interest Amount ");
        double annualInterestRate = input.nextDouble();
        print("Enter number Of years");
        int numberOfyears = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfyears * 12);
        System.out.printf("Accumated value is $%.2f", futureInvestmentValue);
    }




    public static void main(String[] args) {
futureInvestmentValue();
    }

}
